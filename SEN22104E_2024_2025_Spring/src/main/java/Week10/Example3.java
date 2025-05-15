/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

import java.text.DecimalFormat;

/**
 *
 * @author ali.nizam
 */
public class Example3 {

    static public void customFormat(String pattern, double value){
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String result=myFormatter.format(value);
        System.out.println("REsult = "+result);
    }
    
    public static void main(String[] args) {
        customFormat("00000000000.000", 1000.2);
    }
}
