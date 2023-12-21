package homework8;

import java.util.Date;

import homework8.models.TableModel;
import homework8.presenters.BookingPresenter;
import homework8.presenters.Model;
import homework8.presenters.View;
import homework8.views.BookingView;

public class program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Иван Иванов");

        view.changeReservationTable(1001, new Date(), 3, "Иван Иванов");

    }

}
