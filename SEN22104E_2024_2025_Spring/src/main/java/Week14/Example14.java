/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author FSMVU
 */
public class Example14 {
   public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "c:\\files\\cars.obj";
        ObjectOutputStream f=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));        
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new Car("Togg","T1"));
        cars.add(new Car("Togg","T2"));
        cars.add(new Car("Toyota","Coralla"));
        f.writeObject(cars);
        f.close(); 
    }
}
