/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author ali.nizam
 */
public class Example03OutputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream f=new FileOutputStream("c:\\files\\hello.txt",true);
        f.write('M');
        f.close();
    }
}
