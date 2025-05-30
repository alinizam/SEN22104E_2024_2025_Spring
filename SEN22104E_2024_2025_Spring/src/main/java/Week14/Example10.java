/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author FSMVU
 */
public class Example10 {
   public static void main(String[] args) throws FileNotFoundException, IOException {
      String filePath="c:\\files\\binaryData.dat";
      DataInputStream f=new DataInputStream(new DataInputStream(new FileInputStream(filePath)));
      System.out.println(f.readUTF());
      System.out.println(f.readUTF());
      f.close();
    }
}
