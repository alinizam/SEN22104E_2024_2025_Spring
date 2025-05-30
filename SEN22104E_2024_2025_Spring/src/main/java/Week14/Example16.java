/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author FSMVU
 */
public class Example16 {

  public static void main(String[] args) throws IOException {
    Path p = Paths.get("c:\\files\\Hello.txt");
    System.out.println(p.getRoot());
    System.out.println(p.getFileName());
    Path p1 = Paths.get("c:", "files", "Hello.txt");
    System.out.println(p1.toRealPath());
  }
}
