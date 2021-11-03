package com.company;

public class Pizza {
    private String pizzaName;
    private String ingredients;
    private int price;
    private int count;


    public Pizza(String name, String ingredients,int price){
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

    public int getPrice(){
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

