/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author FSMVU
 */
public class Example09 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      String filePath="c:\\files\\binaryData.dat";
      DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
      dos.writeUTF("Ahmet Ak"); 
      dos.writeUTF("Mehmet Sarı");
      dos.close();
    }
}
