/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example05BufferedStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader f = new BufferedReader(new FileReader("c:\\files\\Hello.txt"));
        String s;
        while ((s = f.readLine()) != null) {
            System.out.println(s);
        }
        f.close();
    }
}
