package homework4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * База данных
 */
public class Database {
    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database() {
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /**
     * получить актуальную стоимость билета
     * 
     * @return стоимость билета на текущий момент
     */
    public double getTicketsAmount() {
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * 
     * @param clientId идентификатор покупателя
     * @return № билета
     */
    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}
