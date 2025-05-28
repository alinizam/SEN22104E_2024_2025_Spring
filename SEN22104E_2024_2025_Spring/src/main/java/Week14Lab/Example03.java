/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
     public static void main(String[] args) throws IOException {
        String filePath="c:\\files\\FSM_Words.txt";
        BufferedReader f=new BufferedReader(new FileReader(filePath));
        String word;
        while ((word=f.readLine())!=null){
            char chars[]=word.toCharArray();
            for (char aChar : chars) {
                if (Character.isUpperCase(aChar))
                    System.out.println((char)aChar);
            }
        } 
        f.close();
    }
}
