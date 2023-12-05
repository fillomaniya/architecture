package homework4;

import java.util.Collection;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Core core = new Core();
        MobileApp app = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (app.buyTicket("11000000221")) {
            System.out.println("Клиент успешно купил билет");
            app.searchTicket(new Date());
            Collection<Ticket> tickets = app.getTickets();
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())) {
                System.out.println("Клиент успешно прошёл в автобус");
            }
        }
    }
}