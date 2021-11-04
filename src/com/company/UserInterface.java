package com.company;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private PizzaBase application;
    private int orderNumber = 0;

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
        //opret en ny order
        application.createNewOrder(orderNumber);

        //hent listen af alle order
        List<Order> orders = application.getListOfOrders();

        //Opret ny variabel til at holde den rigtige order
        Order orderVariable = null;
        boolean isNotRightPizza = true;

        //kør alle ordrene igennem og set variablen til den givne order
        while (isNotRightPizza == true){
        for (int i = 0; i < orders.size(); i++){
                orderVariable = orders.get(i);

                //hvis det er den rigtige order - eg. at orderNumber passer - så stopper den med at loope
                if (orderVariable.getOrderNumber() == orderNumber){
                    System.out.println("it's working");
                    isNotRightPizza = false;
                }
            }
        }

        //hent en liste af alle pizzaer
        List<Pizza> pizzas = application.getListOfAllPizzas();

        boolean orderNotFinished = true;

        //Print listen af pizzaer ud
        for (int i = 1; i < pizzas.size(); i++) {
            System.out.println(i + ") " + pizzas.get(i));
        }

        //tilføj pizzaer til ordren
        //Stop når man trykker 0
        while (orderNotFinished == true) {

            System.out.println("choose a pizza to add to the order - press 0 to finish the order");

            int selection = scanner.nextInt();
            switch (selection) {
                case 0:
                    orderNotFinished = false;
                    break;
                case 1:
                    orderVariable.addPizzaToOrder(pizzas.get(1));
                    System.out.println("you added " + pizzas.get(1));
                    break;
                case 2:
                    orderVariable.addPizzaToOrder(pizzas.get(2));
                    System.out.println("you added " + pizzas.get(2));

                    break;
                case 3:
                    orderVariable.addPizzaToOrder(pizzas.get(3));
                    System.out.println("you added " + pizzas.get(3));

                    break;
                case 4:
                    orderVariable.addPizzaToOrder(pizzas.get(4));
                    System.out.println("you added " + pizzas.get(4));

                    break;
                case 5:
                    orderVariable.addPizzaToOrder(pizzas.get(5));
                    System.out.println("you added " + pizzas.get(5));

                    break;
                case 6:
                    orderVariable.addPizzaToOrder(pizzas.get(6));
                    System.out.println("you added " + pizzas.get(6));

                    break;
                case 7:
                    orderVariable.addPizzaToOrder(pizzas.get(7));
                    System.out.println("you added " + pizzas.get(7));

                    break;
                case 8:
                    orderVariable.addPizzaToOrder(pizzas.get(8));
                    System.out.println("you added " + pizzas.get(8));

                    break;
                case 9:
                    orderVariable.addPizzaToOrder(pizzas.get(9));
                    System.out.println("you added " + pizzas.get(9));

                    break;
                case 10:
                    orderVariable.addPizzaToOrder(pizzas.get(10));
                    System.out.println("you added " + pizzas.get(10));

                    break;
                case 11:
                    orderVariable.addPizzaToOrder(pizzas.get(11));
                    System.out.println("you added " + pizzas.get(11));

                    break;
                case 12:
                    orderVariable.addPizzaToOrder(pizzas.get(12));
                    System.out.println("you added " + pizzas.get(12));

                    break;
                case 13:
                    orderVariable.addPizzaToOrder(pizzas.get(13));
                    System.out.println("you added " + pizzas.get(13));

                    break;
                case 14:
                    orderVariable.addPizzaToOrder(pizzas.get(14));
                    System.out.println("you added " + pizzas.get(14));

                    break;
                default:
                    System.out.println("that did not work");

            }
        }

        //forøg orderNumber med 1, så den næste pizzas nummer ikke er det samme som den forrige
        orderNumber++;
    }


    public void seeMenu() {
        //hent menuen
        List<Pizza> pizzas = application.getListOfAllPizzas();

        //print hver pizza ud
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}





