/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1014;

import java.io.FileReader;

import java.io.IOException;

public class FileReaderDemo {

    public static void main(String args[]) {
        //System.out.println(Integer.toHexString(20320));
        try {
            FileReader fr = new FileReader("E:\\20161001\\java2016\\2016-10-12\\11.txt");
//            System.out.println((char)fr.read());
//            System.out.println((char)fr.read());
//            System.out.println(fr.read());
            int x;
            while((x=fr.read())!=-1){
              System.out.println((char)x);
                
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
