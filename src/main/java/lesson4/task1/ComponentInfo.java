package lesson4.task1;

/**
 * Информация о детали
 */

public class ComponentInfo {
    private int id;
    private String description;
    private double price;


    public ComponentInfo(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("#%d - %s", id, description);
    }
}
