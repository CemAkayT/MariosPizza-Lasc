package com.company;

import java.io.FileNotFoundException;
import java.util.List;

public class PizzaBase {

    private Database db;
    private UserInterface ui;

    public PizzaBase(){
        db = new Database();
        ui = new UserInterface(this);
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

    public static void main(String[] args) {
        PizzaBase pizzaBase = new PizzaBase();
        pizzaBase.start();
    }

    public List<Pizza> getListOfAllPizzas(){
        return db.getListOfAllPizzas();
    }
}
