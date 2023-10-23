package lesson4.task2;

public class Core {
    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;
    private final PaymentProvider paymentProvider;
    private final Database database;

    public Core(){
        database = new Database();
        customerProvider = new CustomerProvider(database);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(database, paymentProvider);
    }
    /**
     * Внешний сервис
     * @return возращает сервис по работе с билетами
     */


    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    /**
     * Внешний сервис
     * @return возращает сервис по работе с покупателями
     */
    public CustomerProvider getCustomerProvider() {
        return customerProvider;
    }


}
