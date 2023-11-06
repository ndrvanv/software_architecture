package lesson8.Models;

import java.util.Date;

public class Reservation {

    public Reservation(int tableno, Date date, String name) {
        this.tableno = tableno;
        this.date = date;
        this.name = name;
    }

    private static int counter = 1000;

    private final int id;

    private Date date;
    private String name;
    private final int tableno;
    {
        id = ++ counter;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setTableNo(int newTableNo) {
    }
}
