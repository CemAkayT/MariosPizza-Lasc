package com.company;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private PizzaBase application;
    private int orderNumber = 1;

    public UserInterface(PizzaBase application) {
        this.application = application;
    }

    public void start() {
        System.out.println("Welcome to Marios Pizza");


        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);

        boolean running = true;
        while (running) {
            System.out.println("""
                    1) Create order
                    2) See Menu
                   
                    0) Exit""");
            int selection = input.nextInt();
            input.nextLine();

            switch (selection) {
                case 0:
                    exit();
                    running = false;
                    break;
                case 1:
                    createOrder(input);
                    break;
                case 2:
                    editOrder(input);
                    break;
                case 3:
                    finishOrder(input);
                    break;
                case 4:
                    seeMenu();
                    break;
                case 5:
                    seeActiveOrders();
                    break;
            }
        }
    }

    private void exit() {
        try {
            application.exit();
            System.out.println("Tak for i dag!");
        } catch (FileNotFoundException fne) {
            System.out.println("Der gik noget galt");
        }
    }

    private void createOrder(Scanner scanner) {

        List<Pizza> pizzas = application.getListOfAllPizzas();

        boolean orderNotFinished = true;
        for (int i = 1; i < pizzas.size(); i++) {
            System.out.println(i + ") " + pizzas.get(i));
        }
        while (orderNotFinished == true) {

            System.out.println("choose a pizza to add to the order - press 0 to finish");

            int selection = scanner.nextInt();
            switch (selection) {
                case 0:
                    orderNotFinished = false;
                    break;
                case 1:
                    System.out.println(pizzas.get(1));
                    break;
                case 2:
                    System.out.println(pizzas.get(2));
                    break;
                case 3:
                    System.out.println(pizzas.get(3));
                    break;
                case 4:
                    System.out.println(pizzas.get(4));
                    break;
                case 5:
                    System.out.println(pizzas.get(4));
                    break;
                case 6:
                    System.out.println(pizzas.get(4));
                    break;
                case 7:
                    System.out.println(pizzas.get(4));
                    break;
                case 8:
                    System.out.println(pizzas.get(4));
                    break;
                case 9:
                    System.out.println(pizzas.get(4));
                    break;
                case 10:
                    System.out.println(pizzas.get(4));
                    break;
                case 11:
                    System.out.println(pizzas.get(4));
                    break;
                case 12:
                    System.out.println(pizzas.get(4));
                    break;
                case 13:
                    System.out.println(pizzas.get(4));
                    break;
                case 14:
                    System.out.println(pizzas.get(4));
                    break;
                default:
                    System.out.println("that did not work");

            }
        }


        /*
        System.out.println("Choose pizza");

        System.out.println("Type Pizzaname");
        String pizzaName = scanner.nextLine();

        Pizza pizza = new Pizza(pizzaName);
        application.addPizza(pizza);

         */
    }


    public void seeMenu() {
        List<Pizza> pizzas = application.getListOfAllPizzas();

        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}





