import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
utilizar colections y eliminar el itme nave enviado
si el item de ese momento no entra, probar con los siguientes
* */


public class Simulation {
    /**Create a list of items, and import them from a given file. Carry the items to the ships. When a ship is full,
     * create new one, and store them in a list. When all items are stored, launch and land the rockets. If one fails,
     * relaunch it, and calculate the total budge of the operation*/
    public ArrayList loadItems(String phase) {
        ArrayList<Item> items= new ArrayList<Item>();
        try {
            FileReader file = new FileReader(phase);
            Scanner fileInput = new Scanner(file);
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String name = line.split("=")[0];
                int weight = Integer.parseInt(line.split("=")[1]);
                // Item object = new Item(name, weight);
                items.add(new Item(name, weight));
            }
            fileInput.close();
        }
        catch (IOException e) {
            System.out.println("File doesn't exist");
        }
        return items;
    }
    public ArrayList loadU1(ArrayList<Item> items) {
        ArrayList<U1> U1Rockets = new ArrayList<U1>();
        U1 ship = new U1();
        for(int i=0; i<items.size(); i++) {
            if(ship.canCarry(items.get(i))) {
                ship.carry(items.get(i));
            }
            else {
                U1Rockets.add(ship);
                ship = new U1();
            }
        }
        return U1Rockets;
    }
    public ArrayList loadU2(ArrayList<Item> items) {
        ArrayList<U2> U2Rockets = new ArrayList<U2>();
        U2 ship = new U2();
        for(int i=0; i<items.size(); i++) {
            if(ship.canCarry(items.get(i))) {
                ship.carry(items.get(i));
            }
            else {
                U2Rockets.add(ship);
                ship = new U2();
            }
        }
        return U2Rockets;
    }
    public int runSimulation(ArrayList<Rocket> rocketsList) {
        int totalBudge = 0;
        while (!rocketsList.isEmpty()) {
            totalBudge += rocketsList.get(0).cost;
            System.out.println("Total budge: " + totalBudge);
            if(rocketsList.get(0).launch() && rocketsList.get(0).land()) {
                rocketsList.remove(0);
                System.out.println("Yeeeeeah, the rocket arrives safe");
            }
            else {
                System.out.println("F**k, poor people :'(");
            }
        }
        return  totalBudge;
    }
}
