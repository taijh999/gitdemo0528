/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1012;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String args[]) throws IOException {
        
        FileWriter fw = new FileWriter("E:\\20161001\\java2016\\2016-10-12\\1.txt");
        fw.write("abc\n");
        fw.write(97);
        fw.close();
                

    }
}
