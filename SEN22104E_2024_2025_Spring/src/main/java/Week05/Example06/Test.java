/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Example06;

/**
 *
 * @author FSMVU
 */
public class Test {

  public static void main(String[] args) {
    Car[] cars = new Car[]{new Car(), new Sedan(), new Sedan()};
    int carNumber = 0, sedanNumber = 0;
    for (Car car : cars) {
      if (car instanceof Sedan) {
        sedanNumber++;
      } else if (car instanceof Car) {
        carNumber++;
      }
    }
    System.out.println("Car number: "+carNumber);
    System.out.println("Sedan number: "+sedanNumber);
  }
}
