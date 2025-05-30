/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author FSMVU
 */
public class Example15 {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      String filePath = "c:\\files\\cars.obj";
      ObjectInputStream f=new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));        
      ArrayList<Car> cars=(ArrayList<Car>)f.readObject();
      for (Car c : cars) {
          System.out.println(c.brand+" "+c.model);
    }
      f.close();
  }  
     
}
