package lesson8.Models;

import lesson8.Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTable() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for(Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(tableNo, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    public int changeReservationTable(int reservationId, int newTableNo) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationId) {
                    table.getReservations().remove(reservation);

                    // Find the new table
                    for (Table newTable : tables) {
                        if (newTable.getNo() == newTableNo) {
                            reservation.setTableNo(newTableNo);
                            newTable.getReservations().add(reservation);
                            return reservation.getId();
                        }
                    }
                }
            }
        }
        throw new RuntimeException("Бронь стола не найдена");
    }
}
