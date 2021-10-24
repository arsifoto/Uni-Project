

package Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author zolana
 */

import java.io.IOException;
import java.util.Scanner;

public class VehicleProject {
  /**
     * @param args the command line arguments
     */
    static final int QUEUE_SIZE = 50;
    static Vehicle[] vehiclesArray = new Vehicle[50];
    static VehicleQueue vehicleQueue = new 
    VehicleQueue(QUEUE_SIZE); // linked class Vehcilequeue 
    
   public static void main(String[] args) throws IOException, InterruptedException {

        initialise(vehiclesArray);
        Scanner in = new Scanner(System.in);
        String choice;

//Create a main menu 
        do {

            System.out.println("A:to Add vehicles to the list");
            System.out.println("V:to View the vehicles in the list");
            System.out.println("D:to Delete vehicles from the list");
            System.out.println("S:to Save vehicle data in to a file");
            System.out.println("L:to Print data from file to program");
            System.out.println("R:to Run the simulation and produce report");
            System.out.println("X:to Exit the program");
            String input = in.next().toUpperCase();
            choice = input;
            
            while (!choice.matches("[aAvVdDsSlLrRxX]")) {
                System.out.println("Invalid Input: Choose one of the following");
                System.out.println("A:to Add vehicles to the list");
                System.out.println("V:to View the vehicles in the list");
                System.out.println("D:to Delete vehicles from the queue");
                System.out.println("S:to Save vehicle data in to a file");
                System.out.println("L:to Print data from file to program");
                System.out.println("R:to Run the simulation and produce report");
                System.out.println("X:to Exit the program");
                choice = in.next().toUpperCase();
            }
// options are added in passengerqueue
            switch (choice) {
                case "A":
                    vehicleQueue.add();
                    break;
                case "V":
                    vehicleQueue.view();
                    break;
                case "D":
                    vehicleQueue.remove();
                    break;
                case "S":
                    vehicleQueue.store();
                    break;
                case "L":
                    vehicleQueue.load();
                    break;
             
                 
                case "X":
                    System.exit(0);
            }
        } while (!choice.equals("x"));

    }


    private static void initialise(Vehicle[] vehiclesArray) {
        for (int i = 0; i < vehiclesArray.length; i++) {
            vehiclesArray[i] = new Vehicle();
            vehiclesArray[i].setmake("make");
            vehiclesArray[i].setplateno("plateno");
           
        }
    }
}

   
  
    
    
    

