package org.gb.lesson1.store.modeleElements;

public class Product {

    {
        id = ++ counter;
    }

    public int getId() {
        return id;
    }

    private static int counter = 0;
    private int id;
    private String name;
    private String price;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
