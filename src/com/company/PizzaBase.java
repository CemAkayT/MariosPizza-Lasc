package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PizzaBase {

    private Database db;
    private UserInterface ui;

    public PizzaBase(){
        db = new Database();
        ui = new UserInterface(this);
    }

    public static void main(String[] args) {
        PizzaBase pizzaBase = new PizzaBase();
        pizzaBase.start();
    }

    public void addPizza(Pizza pizza){
        db.addPizza(pizza);
    }

    public void start(){
        ui.start();
    }

    public void exit() throws FileNotFoundException {
        db.saveToFile();
    }

    public List<Pizza> getListOfAllPizzas(){
        return db.getListOfAllPizzas();
    }

    public void createNewOrder(int orderNumber){
        db.createNewOrder(orderNumber);
    }

    public ArrayList<Order> getListOfOrders() {
        return db.getListOfOrders();
    }
}
