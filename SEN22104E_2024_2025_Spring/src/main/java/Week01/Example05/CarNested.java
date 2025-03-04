/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example05;

/**
 *
 * @author FSMVU
 */
public class CarNested {
    String model;
    private String company;
    class SubDriver extends Driver{
        void getCarModel() {
            System.out.println(model);    
        }

    }
}
