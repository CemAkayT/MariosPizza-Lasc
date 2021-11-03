package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    private ArrayList<Pizza> listen;

        public Database() {
            listen = new ArrayList<>();
            loadFromFile();
        }

        public void addPizza(Pizza pizza) {
            listen.add(pizza);
        }

        public void saveToFile() throws FileNotFoundException {
            // Lav en ny fil
            File fil = new File("Menu.CSV");
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
                File fil = new File("Menu.CSV");
                Scanner reader = new Scanner(fil);

                while(reader.hasNext()) {
                    String line = reader.nextLine();
                    // Opret et Pizza objekt for hver linje
                    Pizza pizza = new Pizza(line);
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
    }

