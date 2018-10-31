/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1012;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileWriterDemo1 {

    public static void main(String args[]) {
        Random random = new Random();
        int x;
        try {
            FileWriter fw = new FileWriter("E:\\111gbk.txt");
            long t1=System.currentTimeMillis();
            for (int i = 1; i <= 100000; i++) {
                x = random.nextInt(1000) + 1;
                if (i % 10 == 0) {
                    fw.write(x + "\n");
                } else {
                    fw.write(x + " ");
                }
            }
               fw.close();
              long t2=System.currentTimeMillis();
              System.out.println(t2-t1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
