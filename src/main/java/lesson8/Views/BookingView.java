package lesson8.Views;

import lesson8.Models.Table;
import lesson8.Presenters.View;
import lesson8.Presenters.ViewObserver;

import javax.management.ValueExp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();
    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for(Table table :tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Стоилик успешно забронирован #%d\n", reservationNo);
        }
        else {
            System.out.println("Невозможно забронирвать столик. \nПовторите попытку позже");
        }
    }


    public void reservationTable(Date reservationDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onObservationTable(reservationDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){

    }

}
