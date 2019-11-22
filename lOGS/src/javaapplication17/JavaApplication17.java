/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author allanmonge
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("logFile.txt");
            String content = "This is the content to write into a file";
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
          
            bw.append(content);
            bw.append(content);
            bw.append(content);
            bw.append(content);
            
            
            bw.write(content);
            bw.close(); 
            
            
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
        
        
        
        
        
}
    