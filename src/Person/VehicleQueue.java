/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author zolana
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public final class VehicleQueue {
    
    Scanner in = new Scanner(System.in);
    private int first = 0;
    private int last = 0;
    private int size = 0;
    static final int QUEUE_SIZE = 50;
   Vehicle[] queueArray = new Vehicle[QUEUE_SIZE];

    public VehicleQueue(int QUEUE_SIZE) {

        initialise(queueArray);

    }
public void initialise(Vehicle[] queueArray) {
        for (int i = 0; i < queueArray.length; i++) {
            queueArray[i] = new Vehicle();
            queueArray[i].setmake("make");
            queueArray[i].setplateno("plateno");
        }

    }
    
//add is create where user  input is needed for make and plateno 
    public void add() {

        if (isFull()) {
            System.out.println("Queue is full");
        } 
   else {
            String input;
            System.out.println("Enter make");
            input = in.next().toUpperCase();
            queueArray[last].setmake(input);
            while (!input.matches("[a-zA-Z,]+")) {
                System.out.println("Invalid");
                System.out.println("Enter plateno");
                input = in.next().toUpperCase();
                queueArray[last].setmake(input);
            }

            System.out.println("Enter plateno");
            input = in.next().toUpperCase();
            queueArray[last].setplateno(input);
            while (!input.matches("[a-zA-Z0-9]+")) {
                System.out.println("Invalid");
                input = in.next().toUpperCase();
                queueArray[last].setplateno(input);
            }

            System.out.println(queueArray[last].make + " " + queueArray[last].plateno + " added to queue");

            last = (last + 1) % queueArray.length;
            size++;
        }

    }
// item/name will be removed from first array of queue 
    public void remove() {
        if (!isEmpty()) {
            System.out.println("Vehicle removed: " + queueArray[first].getmake() + " " + queueArray[first].getplateno());
            queueArray[first].make = "removed";
            queueArray[first].plateno = "removed";
            first = (first + 1) % queueArray.length;
            size--;
        } else {
            System.out.println("Removed");
        }
    }
// Enter V to display queue
    public void view() {
        if (isEmpty()) {
            System.out.println("Empty List!! No data to view");
        } else {
            for (int i = 0; i < queueArray.length; i++) {
                System.out.println(queueArray[i].getmake() + " " + queueArray[i].getplateno());
            }
        }

    }
// names will be store in file which was enter by user
    public void store() throws IOException {
        BufferedWriter outputWriter;
        outputWriter = null;

        outputWriter = new BufferedWriter(new FileWriter("C:\\Users\\zolana\\Desktop\\OOP\\vehcile\\myFile1.txt"));
        for (int i = 0; i < queueArray.length; i++) {
            outputWriter.write(queueArray[i].getmake() + " " + queueArray[i].getplateno() + " ");
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();

    }

    public void load() throws IOException {
        int lineCount = 0;
        try (Scanner rf = new Scanner(new BufferedReader(new FileReader("C:\\Users\\zolana\\Desktop\\OOP\\vehcile\\myFile1.txt")))) {
            String fileLine;
            while (rf.hasNext()) {
                fileLine = rf.nextLine();
                String vehicleHash[] = fileLine.split(" ");
                queueArray[lineCount].setmake(vehicleHash[0]);
                queueArray[lineCount].setplateno(vehicleHash[1]);
                System.out.println(queueArray[lineCount].getmake() + " " + queueArray[lineCount].getplateno());
                lineCount++;

            }
        } catch (IOException e) {
            System.out.println("Error IOException is: " + e);
        }

    }

    public boolean isFull() {
        boolean full = false;
        if (size == queueArray.length) {
            full = true;
        }
        return full;

    }

    public boolean isEmpty() {
        boolean empty = false;
        if (size == 0) {
            empty = true;
        }
        return empty;

    }


    public void initialiseQueue(Vehicle[] vehiclesQueue) {

        for (int i = 0; i < vehiclesQueue.length; i++) {
            vehiclesQueue[i] = new Vehicle();
            vehiclesQueue[i].setmake("make");
            vehiclesQueue[i].setplateno("plateno");
        
        }

    }
}

