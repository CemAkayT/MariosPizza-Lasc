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
        return pizzaName + ";" + ingredients + ";" + price;
    }

    public String toCSVString(){
        return pizzaName + ";" + ingredients + ";" + price;

    }

    public void fromCSvString(String csvstring){

    }

}

