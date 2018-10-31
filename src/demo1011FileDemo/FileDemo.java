/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1011FileDemo;

import java.io.File;
import java.util.Date;

public class FileDemo {

    public static void main(String args[])
             {
       
        File f = new File("e:/20161001/java2016/worf.txt");
        System.out.println(f.getName());
        System.out.println(f.exists());
        System.out.println(f.getParent());
        System.out.println(f.length());
        System.out.println(f.lastModified());
        
        
        Date d1=new Date(f.lastModified());
        System.out.println(d1);
        
        
        
        
        
        
      

    }
}
