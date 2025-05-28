/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) throws IOException {
        String filePath="c:\\files\\FSM_Words.txt";
        BufferedWriter f=new BufferedWriter(new FileWriter(filePath));
        String words[]="Fatih Sultan Mehmet".split(" ");
        for (String word : words) {
            f.write(word);
            f.newLine();
        }
        f.close();
    }
}
