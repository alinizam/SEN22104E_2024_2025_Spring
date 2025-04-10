/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        String[] words={"Fatih","Sultan","Mehmet"};
        String sentences="";
        for (String word : words) {
          //sentences+=word+" ";    //first solution
            sentences=sentences.concat(word+" "); 
        }
        System.out.println(sentences);
    
    }
}
