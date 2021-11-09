package com.company;

import java.util.ArrayList;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class Order {

    private ArrayList<Pizza> orders;
    private int orderNumber;
    private LocalTime timeAdded;

    public Order(int orderNumber){
        this.orderNumber = orderNumber;
        orders = new ArrayList<>();

    }

    public int getOrderNumber(){
        return orderNumber;
    }

    public void addPizzaToOrder(Pizza pizza){
        orders.add(pizza);
    }

    public ArrayList<Pizza> getPizzas(){
        return orders;
    }

    public LocalTime getTimeAdded() {
        LocalTime tidspunkt = LocalTime.now().truncatedTo( ChronoUnit.MINUTES );
        return tidspunkt;
    }

    public void setTimeAdded(LocalTime timeAdded) {
        this.timeAdded = timeAdded;
    }

   
    


}
