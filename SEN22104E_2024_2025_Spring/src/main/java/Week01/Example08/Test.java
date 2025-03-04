/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example08;

/**
 *
 * @author FSMVU
 */
public class Test {
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal a1=new Cat();
        System.out.println(a1.getName());
        ((Cat)a1).sayMiaw();
        if (a1 instanceof Cat) ((Cat)a).sayMiaw();        
    }
}
