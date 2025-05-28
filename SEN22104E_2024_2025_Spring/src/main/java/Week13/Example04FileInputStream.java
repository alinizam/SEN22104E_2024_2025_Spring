/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example04FileInputStream {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("c:\\files\\Hello.txt");
            int b;
            while ((b=f.read())!=-1){
                System.out.println((char)b);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example04FileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example04FileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
