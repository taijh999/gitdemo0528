/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1011FileDemo;

import java.io.File;
import java.util.Date;

public class FileDemo1 {

    public static void main(String args[]) {

        File folder = new File("E:\\20161001\\java2016\\ch05\\src");
        File files[] = folder.listFiles();

        int countJava=0;
        int countTxt=0;
        String fileName;
        for (int i = 0; i < files.length; i++) {
            fileName=files[i].getName();
            
            if (fileName.endsWith("java")) {
                 countJava++;
                //System.out.println(files[i].getName());
            }else if(fileName.endsWith("txt")){
                 countTxt++;
            }
        }
        
        
        for (File f:files) {
            fileName=f.getName();
            if (fileName.endsWith("java")) {
                 countJava++;
                //System.out.println(files[i].getName());
            }else if(fileName.endsWith("txt")){
                 countTxt++;
            }
        }
        System.out.println("txt files count="+countTxt);
        System.out.println("java files count="+countJava);
        

    }
}
