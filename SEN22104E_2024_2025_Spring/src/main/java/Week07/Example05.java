/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author FSMVU
 */
public class Example05 {
  public static void main(String[] args) {
    String s="Fatih Sultan VAkıf Üniversity";
    char c=s.charAt(0);
    System.out.println(c);
    
    
    //s=s+" Mehmet";
    //System.out.println(s);
    System.out.println(s.concat(" Mehmet"));
    System.out.println(s);
   // s=s.concat(" Mehmet");
   // System.out.println(s);
      
   
    String[] words=s.split(" ");
    for (String word : words) {
       System.out.println(word);
    }
    
    
    String name="    istanbula istanbul";
    System.out.println(name.trim());
    
    System.out.println(name.toUpperCase());
    
    System.out.println(name.lastIndexOf("gggg"));
    
    
    System.out.println(name.contains("dsdsf"));
    
    
    System.out.println(name.replace("i", "İ"));
    
    System.out.println(name.startsWith("    dddi"));
    
    
    System.out.println("Ahmet".compareTo("Aba"));
    
    System.out.println("iahmet".equalsIgnoreCase("İAhmet"));
    int i=Integer.parseInt("1000");
    int i1=Integer.valueOf("1000");
    
    
    int i2=Integer.valueOf("1000");
    
    String s3=Integer.toString(1000);
  
     
  }
}
