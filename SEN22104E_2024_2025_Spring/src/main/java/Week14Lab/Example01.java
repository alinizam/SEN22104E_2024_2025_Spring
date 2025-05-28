/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab; 
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        writeBytes("Fatih Sultan Mehmet Vakıf University");
    }
    static void writeChars(String s){
        char chars[]=s.toCharArray();
        try (FileWriter f=new FileWriter("c:\\files\\FSM.txt");) {
            for (char aChar : chars) {
                f.write(aChar);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Example01.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    static void writeBytes(String s){
        char chars[]=s.toCharArray();
        try (FileOutputStream f=new FileOutputStream("c:\\files\\FSM.txt");) {
            for (char aChar : chars) {
                f.write((byte)aChar);
            }
        } catch (IOException ex) {
            Logger.getLogger(Example01.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
