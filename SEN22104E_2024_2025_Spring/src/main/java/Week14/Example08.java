/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FSMVU
 */
public class Example08 {
   public static void main(String[] args) throws IOException {
    char c;
    // Create a BufferedReader using System.in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\files\\out.txt"));
    bw.write(br.readLine());
    br.close();
    bw.close();
  }
}