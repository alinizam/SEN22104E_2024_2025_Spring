/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author FSMVU
 */
public class Example04 {
  public static void main(String[] args) throws FileNotFoundException {
      Scanner s=new Scanner(new FileInputStream("c:\\files\\numbers.txt"));
      double totalsalary=0;
      s.useLocale(Locale.US);
      while(s.hasNext()){
        s.next();
        s.next();
        totalsalary+=s.nextDouble();
      }
      System.out.println(totalsalary);
  }
}
