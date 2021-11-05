package com.company;

public class Pizza {
    private String pizzaName;
    private String ingredients;
    private String price;
    private int count;

    public Pizza(String name, String ingredients, String price){
        this.pizzaName = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public Pizza (String CSVLine){
        fromCSvString(CSVLine);
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getIngredients(){
        return ingredients;
    }

    public String getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return"\033[0;91m" + pizzaName + "\u001B[0m" + "," + "\u001B[33m" + ingredients + "," + "\u001B[34m" + price + " DKK";
    }

    public String toCSVString(){
        return pizzaName + ";" + ingredients + ";" + price;

    }

    public void fromCSvString(String csvstring){

    }

}

