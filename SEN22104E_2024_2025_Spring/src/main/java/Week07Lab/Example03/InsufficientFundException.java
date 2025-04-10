/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example03;

/**
 *
 * @author ali.nizam
 */
public class InsufficientFundException extends RuntimeException{
    int money;

    public InsufficientFundException(int money) {
        System.out.println("REquired money"+ money);
        this.money = money;
    }
    
    
    
}
