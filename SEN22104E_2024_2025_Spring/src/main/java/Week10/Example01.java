/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ali.nizam
 */
public class Example01 {

    public static void main(String[] args) {
        //String pattern
        // String pattern = "a";
        
        //String pattern = "[\\w]";
        // String pattern = "[\\d]{3,}";
        
       //String pattern = "\\b([^\\d]+[A-z]+)";
         String pattern = "\\Gdog";
        
        String string2Research = "dog dog dog dd dog";
        search (pattern, string2Research);
    }

    static void search(String pattern, String string2Research) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string2Research);
        while (m.find()) {
            System.out.println(m.group() + ": " + m.start() + "-" + m.end());
        }

    }

}
