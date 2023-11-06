package lesson8;

import lesson8.Models.TableModel;
import lesson8.Presenters.BookingPresenter;
import lesson8.Presenters.Model;
import lesson8.Presenters.View;
import lesson8.Views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter((TableModel) model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Artem");
        view.changeReservationTable(1001, new Date(), 3, "Artem");
    }

}
