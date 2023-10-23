package lesson4.task2;

import java.util.ArrayList;
import java.util.Collection;

public class Database {

    public void Datebase(){
        Customer customer_1 = new Customer();
        Customer customer_2 = new Customer();
        Customer customer_3 = new Customer();
        Customer customer_4 = new Customer();
        Customer customer_5 = new Customer();

        customers.add(customer_1);
        customers.add(customer_2);
        customers.add(customer_3);
        customers.add(customer_4);
        customers.add(customer_5);

        Ticket ticket_1 = new Ticket();
        Ticket ticket_2 = new Ticket();
        Ticket ticket_3 = new Ticket();
        Ticket ticket_4 = new Ticket();
        Ticket ticket_5 = new Ticket();

        tickets.add(ticket_1);
        tickets.add(ticket_2);
        tickets.add(ticket_3);
        tickets.add(ticket_4);
        tickets.add(ticket_5);
    }
    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }
    /**
     * Получить актуальную стоимость билета
     * @return
     */

    public double getTicketAmount(){
        return 45;
    }
    /**
     * Получить идентификатор заявки на покупку билета
     * @return
     */
    public int createTicketOrder(int clientId){
        return ++counter;
    }
}
