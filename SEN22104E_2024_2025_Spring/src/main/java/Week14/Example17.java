/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.*;

/**
 *
 * @author FSMVU
 */
public class Example17 {

  public static void main(String[] args) throws IOException {
    Files.copy(Paths.get("c:\\files\\Hello.txt"),
            Paths.get("c:\\files\\Hello1.txt"), REPLACE_EXISTING);

    Path dir = Paths.get("c:\\files");
    try ( DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
      for (Path file : stream) {
        System.out.println(file.getFileName());
      }
    } catch (IOException | DirectoryIteratorException x) {
      // IOException can never be thrown by the iteration.
      // In this snippet, it can only be thrown by newDirectoryStream
    }

  }
}
