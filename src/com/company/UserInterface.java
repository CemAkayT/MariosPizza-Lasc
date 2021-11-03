package com.company;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private PizzaBase application;

    public UserInterface(PizzaBase application){
        this.application = application;
    }

    public void start(){
        System.out.println("Welcome to Marios Pizza");


        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);

        boolean running = true;
        while( running ){
            System.out.println("""
                    1) Create order
                    2) See Menu
                   
                    0) Exit""");
            int selection = input.nextInt();
            input.nextLine();

            switch (selection){
                case 0: exit();
                        running = false;
                        break;
                case 1: createOrder(input);
                        break;
                case 2: seeMenu();
                        break;
            }
        }
    }

    private void exit(){
        try{
            application.exit();
            System.out.println("Tak for i dag!");
        }
        catch (FileNotFoundException fne){
            System.out.println("Der gik noget galt");
        }
    }

    private void createOrder(Scanner scanner){
        System.out.println("Choose pizza");

        System.out.println("Type Pizzaname");
        String pizzaName = scanner.nextLine();

        Pizza pizza = new Pizza(pizzaName);
        application.addPizza(pizza);
    }


    public void seeMenu(){
        List<Pizza> pizzas = application.getListOfAllPizzas();

        for (Pizza pizza : pizzas){
            System.out.println(pizza);
        }
    }
}





