package lesson4.task2;

import java.util.Collection;
import java.util.Date;

public class Program {
    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     *
     * 1. Предусловия
     * 2. Постуслвия
     * 3. Инвариант
     * 4. Определить абстрактные и конкретные классы
     * 5. Определить интерфейсы
     * 6. Реализовать наследования
     * 7. Выявить компоненты
     * 8. Разработать диаграмму компонент используя нотацию UML 2.0. Общая без деталей
     */

    public static void main(String[] args) {
        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (mobileApp.buyTicket("10000000000000003")){
            mobileApp.searchTicket(new Date());
        }

        Database database = new Database();
        Collection<Customer> customers = database.getCustomers();
        Collection<Ticket> tickets = database.getTickets();
    }
}
