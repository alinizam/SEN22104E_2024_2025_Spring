/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example03;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        String name="Fatih Sultan Mehmet";
        name=name+" ";
        int start=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==' '){
                System.out.println(name.substring(start,i));
                start=i+1;
            }
        }
    }
}
