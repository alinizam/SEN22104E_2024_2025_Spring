/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example08;

/**
 *
 * @author FSMVU
 */
public class Cat extends Animal{
    void sayMiaw(){
        System.out.println("Miaw");
    }

    @Override
    String getName() {
        return "I am a cat"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
