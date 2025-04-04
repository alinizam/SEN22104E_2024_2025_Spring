/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author FSMVU
 */
public class Example07 {

  public static void main(String[] args) {
    try {
      int i = 5, j = 1;
      System.out.println(i / j);
      int[] numbers = {12, 23};
      System.out.println(numbers[3]);
      Object o = new Object();
      System.out.println(((Employee) o).name);
    }catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    } catch (ClassCastException e) {
      System.out.println("ClassCastException");
      throw new ArithmeticException(); //unsolved exception for this try catch block
    }  catch (ArrayStoreException|IndexOutOfBoundsException e) {
      System.out.println("Exception"); 
    }    catch (Exception e) {
      System.out.println("Exception"); 
    }
    System.out.println("Finished");

  }
}
