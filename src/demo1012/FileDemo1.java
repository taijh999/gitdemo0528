/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1012;

import demo1011FileDemo.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {

    public static void main(String args[])
             {
                 Date d1=new Date();
                 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                 String dir=sdf.format(d1);
       
        File f = new File("e:/20161002/java2016/"+dir);

        f.mkdirs();  //directory 目录
        System.out.println(f.isDirectory());
        
        
        
       
        
        
        
        
        
        
      

    }
}
