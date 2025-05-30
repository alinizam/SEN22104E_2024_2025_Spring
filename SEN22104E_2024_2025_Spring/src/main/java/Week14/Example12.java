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

/**
 *
 * @author FSMVU
 */
public class Example12 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "c:\\files\\cars.obj";
        ObjectOutputStream f=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));        
        Car c=new Car("Togg", "SuperCar");
        f.writeObject(c);
        f.close();
        
        
    }
}
