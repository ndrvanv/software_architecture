package lesson8.Presenters;

import lesson8.Models.TableModel;
import lesson8.Views.BookingView;

import java.util.Date;

public class BookingPresenter implements ViewObserver{
    private final TableModel model;
    private final BookingView view;

    public BookingPresenter(TableModel model, BookingView view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }


    public void updateTables(){
        view.showTables(model.loadTable());
    }

    private void showReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }
    @Override
    public void onObservationTable(Date reservationDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(reservationDate, tableNo, name);
            showReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            showReservationTableResult(-1);
        }
    }
}
