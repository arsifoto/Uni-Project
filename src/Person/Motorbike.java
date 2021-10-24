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
public class Motorbike extends Vehicle{
    
    private double size;
     private String RegNo;
    
    public Motorbike(String make, String regno){
        super(make);
        this.RegNo = regno;   
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    public double getSize(){
        return size;
    }
    
    
    public String toString(){
        return "The name of the brand is " + this.getMake() + " the salary is " + size;
    }
}

