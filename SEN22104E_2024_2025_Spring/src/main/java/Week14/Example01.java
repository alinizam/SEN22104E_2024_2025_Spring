/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Week14;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author FSMVU
 */
public class Example01 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedOutputStream f=new BufferedOutputStream(new FileOutputStream("c:\\files\\hello.txt"));
        f.flush();
         
    }
}
