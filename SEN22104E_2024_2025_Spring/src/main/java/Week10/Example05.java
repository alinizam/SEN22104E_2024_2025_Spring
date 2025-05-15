/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        double d=Math.random();
        int numberCount[]=new int[3];
        for (int j = 0; j < 1000000; j++) {
            
            numberCount[(int)(3*Math.random())]++;
        }
        System.out.println(numberCount[0] +": "+numberCount[1] +": "+ numberCount[2]);
        
    }
}
