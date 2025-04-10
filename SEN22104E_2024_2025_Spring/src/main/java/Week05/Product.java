/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author FSMVU
 */
public class Product {

  int totalAmount;
  String name;
  
  public Product(int totalAmount, String name) {
    this.totalAmount = totalAmount;
    this.name = name;
  }

  void decreaseAmount(int amount2Decrease) {
    if (totalAmount - amount2Decrease < 0) {
      throw new ArithmeticException("Product amount can not be less than zero");
    }
    this.totalAmount -= amount2Decrease;
  }
   void decreaseAmountWithMyException(int amount2Decrease) {
    if (totalAmount - amount2Decrease < 0) {
      throw new AmountLessThanZeroException();
    }
    this.totalAmount -= amount2Decrease;
  }

  void displayAmount() {
    System.out.println(name + ": " + totalAmount);
  }
}
