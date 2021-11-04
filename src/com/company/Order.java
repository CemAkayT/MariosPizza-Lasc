package com.company;

import java.util.ArrayList;

public class Order {

    private ArrayList<Pizza> orders;
    private int orderNumber;

    public Order(int orderNumber){
        this.orderNumber = orderNumber;
    }

    public void addPizzaToOrder(Pizza pizza){
        orders.add(pizza);
    }
}
