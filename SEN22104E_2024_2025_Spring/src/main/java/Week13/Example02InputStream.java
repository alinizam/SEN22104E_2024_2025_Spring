/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example02InputStream {

    public static void main(String[] args) {
        try (InputStream f = new FileInputStream("c:\\files\\hello.txt")) {
            int b;
            while ((b=f.read())!=-1){
                System.out.println((char)b);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example02InputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example02InputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
