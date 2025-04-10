/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Example07;

/**
 *
 * @author FSMVU
 */
public class Test {
  public static void main(String[] args) {
    try {
        throw new ZeroFundException();
    }catch (ZeroFundException e) {
      
    }
    catch (RuntimeException e) {
    } 
  }
}
