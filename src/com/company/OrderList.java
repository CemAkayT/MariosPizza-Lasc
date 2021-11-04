package com.company;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<Order> listOfOrders;

    public OrderList(){

    }

    public void createNewOrder(int orderNumber){
        Order order = new Order(orderNumber);
        listOfOrders.add(order);
    }
}
