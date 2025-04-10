/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example03;

/**
 *
 * @author ali.nizam
 */
public class Account {
    int totalMoney;
    void withDraw(int amount){
        if (totalMoney-amount<0){
            throw new InsufficientFundException(totalMoney-amount);
        }
        this.totalMoney-=amount;
    }
}
