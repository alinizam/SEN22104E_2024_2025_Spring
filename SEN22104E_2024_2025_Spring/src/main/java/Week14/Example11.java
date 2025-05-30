/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author FSMVU
 */
public class Example11 {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    String filePath = "c:\\files\\binaryData.dat";
    DataInputStream f = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
    //DataInputStream f1 = new DataInputStream(new FileInputStream(filePath)); another way
    
    try{
        while (true) {
        System.out.println(f.readUTF());
      }
    }catch( EOFException e){
      System.out.println("File read operation is finished");
    }
    //f.close();
  }
}
