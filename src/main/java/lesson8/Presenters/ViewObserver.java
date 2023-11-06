package lesson8.Presenters;

import java.util.Date;

public interface ViewObserver {
    void onObservationTable(Date reservationTable, int tableNo, String name);
}
