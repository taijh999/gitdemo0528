/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1014;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo1 {

    public static void main(String args[]) {
        //System.out.println(Integer.toHexString(20320));
        try {
            FileReader fr = new FileReader("E:\\20161001\\java2016\\2016-10-12\\11.txt");
            FileWriter fw = new FileWriter("E:\\20161001\\java2016\\2016-10-12\\33.txt");
            

            int x;
            while((x=fr.read())!=-1){
              fw.write(x);
                
            }

            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
