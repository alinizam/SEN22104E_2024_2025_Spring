/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Week01;

import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author FSMVU
 */
public class Example01 {

    public static void main(String[] args) {
        JFrame f=new JFrame();
        JTextField t1=new JTextField("Hello");
        f.add(t1);
        JButton b1=new JButton("World");
        f.add(b1);
        
        for (int i = 0; i < 10; i++) {
            f.add(new Button(i+""));
        }
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.pack();
                
    }
}
