package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    private ArrayList<Pizza> listen;
    private OrderList orderList;

        public Database() {
            listen = new ArrayList<>();
            orderList = new OrderList();
            loadFromFile();

        }

        public void addPizza(Pizza pizza) {
            listen.add(pizza);
        }

        public void saveToFile() throws FileNotFoundException {
            // Lav en ny fil
            File fil = new File("data/Menu.CSV");
            PrintStream ps = null;
            ps = new PrintStream(fil);

            // loop igennem listen af pizzaer
            for(Pizza pizza : listen) {
                // skriv hver pizza til filen
                ps.println(pizza.toCSVString());
            }
        }

        public void loadFromFile() {
            // Åbn en fil
            // Læs hver linje i filen
            try {
                File fil = new File("data/Menu.CSV");
                Scanner reader = new Scanner(fil);
                reader.useDelimiter(";");

                while(reader.hasNext()) {

                    String line = reader.nextLine();
                    // Opret et Pizza objekt for hver linje
                    String[] newPizza = line.split(";");

                    Pizza pizza = new Pizza(newPizza[0], newPizza[1], newPizza[2]);
                    listen.add(pizza);

                }

            } catch (FileNotFoundException e) {
                // No file found - just ignore, and start with empty database!
                listen.clear();
            }
        }
        public List<Pizza> getListOfAllPizzas() {
            return listen;
        }

        public void createNewOrder(int orderNumber){
            orderList.createNewOrder(orderNumber);
        }

        public void finishOrder() throws FileNotFoundException {
            //orderList.finishOrder();

            File file = new File("data/orderHistory");
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));

            List<Order> listOfOrders = getListOfOrders();
            Order order = listOfOrders.get(0);

            ps.println(order.getOrderNumber());
            for (Pizza pizza: order.getPizzas()){
                ps.println(pizza);
            }

            listOfOrders.remove(0);
        }

    public ArrayList<Order> getListOfOrders() {
        return orderList.getListOfOrders();
    }
}

