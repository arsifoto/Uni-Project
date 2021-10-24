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
public class Car extends Vehicle{
    
    private String RegNo;
    private int size;
    
    public Car(String make,String model, String regno){
        super(make);
        this.RegNo = regno;   
    }
   public void setRegNo (String regno){
       this.RegNo = regno;
   } 
   public String GetRegNo (){
       return RegNo;
   }
    public void setSize(int size){
        this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    // add other set and get methods
    
}