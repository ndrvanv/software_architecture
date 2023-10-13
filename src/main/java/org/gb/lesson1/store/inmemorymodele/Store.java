package org.gb.lesson1.store.inmemorymodele;

import org.gb.lesson1.store.modeleElements.Order;

import java.util.Collection;
import java.util.HashSet;

public class Store {

    private Collection<Order> orders = new HashSet<>();

    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id){
//        TODO: Отмена заказа
        return true;
    }

    public boolean paymentOrder(int id){
//        TODO: Опалта заказа
        return true;
    }
}
