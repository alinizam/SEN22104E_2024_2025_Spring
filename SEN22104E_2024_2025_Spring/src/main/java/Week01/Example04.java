/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Week01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author FSMVU
 */
public class Example04 {

    public static void main(String[] args) {
        JFrame f=new JFrame();
        JTextField t1=new JTextField("Hello");
        f.add(t1);
        JButton b1=new JButton("World");
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myClickMethod(e);
                        
            }

            private void myClickMethod(ActionEvent e) {
                t1.setText("Click");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
    
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.pack();
                
    }
}
