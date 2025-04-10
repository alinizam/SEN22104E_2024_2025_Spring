/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example03;

/**
 *
 * @author ali.nizam
 */
public class Test {

    public static void main(String[] args) {
         Account ahmetAccount = new Account();
            ahmetAccount.totalMoney = 500;
        try {
           
            ahmetAccount.withDraw(200);
            System.out.println(ahmetAccount.totalMoney);
            ahmetAccount.withDraw(200);
            System.out.println(ahmetAccount.totalMoney);
            ahmetAccount.withDraw(500);
            System.out.println(ahmetAccount.totalMoney);
        } catch (InsufficientFundException e) {
            System.out.println("Not enough money");
        
        }
        System.out.println(ahmetAccount.totalMoney);

    }
}
