/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {

    public static void main(String args[])
             {
        TreeMap<String, Integer> map
                = new TreeMap<String, Integer>();
        File f = new File("e:/20161001/java2016/worf.txt");
         Scanner scFile=null;
        try{
           scFile = new Scanner(f);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            return;
            //System.out.println("文件不存在");
            
        }     
// map.put(scFile.next(),scFile.next());
        //  map.put(scFile.next(),scFile.next());
        while (scFile.hasNext()) {
            String eng = scFile.next();
            if (!map.containsKey(eng)) {
                map.put(eng, 1);
            } else {
                map.put(eng, map.get(eng) + 1);
            }
            
            //map.put(scFile.next(),scFile.next());
        }
        //for(String s:map.keySet()){
        for(String s:map.keySet()){
            
          System.out.println(s+"="+map.get(s));
          
      }

    }
}
