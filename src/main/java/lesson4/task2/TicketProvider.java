package lesson4.task2;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TicketProvider {
    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider) {
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    /**
     * Возвращает коллекцию билетов, соответствующих указанному клиенту и дате.
     * Предусловие: clientId не должен быть отрицательным числом.
     * Предусловие: date не должна быть равной null.
     * Постусловие: возвращаемая коллекция не должна быть равной null.
     */
    public Collection<Ticket> ticketsTicket(int clientId, Data date){
        assert clientId >= 0 : "clientId should not be negative";
        assert date != null : "date should not be null";

        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket: database.getTickets()){
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date))
                tickets.add(ticket);
        }
        return tickets;
    }

    /**
     * Покупает билет для указанного клиента с использованием указанного номера карты.
     * Предусловие: clientId не должен быть отрицательным числом.
     * Предусловие: cardNo не должна быть равна null или пустой строке.
     * Постусловие: возвращает true, если покупка прошла успешно, иначе false.
     */
    public boolean buyTicket(int clientId, String cardNo){
        assert clientId >= 0 : "clientId should not be negative";
        assert cardNo != null && !cardNo.isEmpty() : "cardNo should not be null or empty";

        int orderId = database.createTicketOrder(clientId);
        double amount = database.getTicketAmount();
        return paymentProvider.buyTicket(orderId, cardNo, amount);
    }

    /**
     * Проверяет билет с указанным QR-кодом.
     * Предусловие: qrcode не должен быть равен null или пустой строке.
     * Постусловие: если билет с указанным QR-кодом найден, его статус "enable" устанавливается в false.
     * Постусловие: возвращает true, если билет найден, иначе false.
     */
    public boolean checkTicket(String qrcode){
        assert qrcode != null && !qrcode.isEmpty() : "qrcode should not be null or empty";

        for (Ticket ticket: database.getTickets()){
            if (ticket.getQrcode().equals(qrcode)){
                ticket.setEnable(false);
                // Сохранение в базу данных ...
                return true;
            }
        }
        return false;
    }

    public Ticket searchTicket(int clientId, Date date){
        assert date != null : "date should not be null";

        for (Ticket ticket: database.getTickets()){
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date)){
                return ticket;
            }
        }
        return null;
    }
}