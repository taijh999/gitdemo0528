/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1012;

import demo1011FileDemo.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

    public static void main(String args[])
             {
       
        File f = new File("e:/20161001/java2016/demodir");
        if(!f.exists()){
            try{
               f.createNewFile();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        if(f.exists()){
            
            f.delete();
            
        }
        f.mkdir();  //directory 目录
        
        
       
        
        
        
        
        
        
      

    }
}
