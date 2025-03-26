/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Lab;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        String numbers[]={"1" , "6" , "1fds", "10", "5o"};
        for (String n : numbers){
            try {
                 Integer.parseInt(n);
            } catch (Exception exc) {
                System.out.println("Exception for : "+n);
            } 
        }
    }
}
