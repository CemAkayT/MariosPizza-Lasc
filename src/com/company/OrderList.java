package com.company;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<Order> listOfOrders;

    public OrderList(){
        listOfOrders = new ArrayList<>();
    }

    public ArrayList<Order> getListOfOrders(){
        return listOfOrders;
    }

    public void createNewOrder(int orderNumber){
        Order order = new Order(orderNumber);
        listOfOrders.add(order);
    }

    /*public void finishOrder(){
        if (listOfOrders.size() == 0){

        }
        else {
            listOfOrders.remove(0);
        }
    }*/


}
