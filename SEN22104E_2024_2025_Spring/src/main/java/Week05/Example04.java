/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author FSMVU
 */
public class Example04 {

  public static void main(String[] args) {
    try {

      Product p = new Product(50, "Pen");
      p.decreaseAmountWithMyException(30);
      p.displayAmount();
      p.decreaseAmountWithMyException(15);
      p.displayAmount();
      p.decreaseAmountWithMyException(10);
      p.displayAmount();

    } catch (AmountLessThanZeroException e) {
      System.out.println(e.getMessage());
    }

  }
}
