/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1012;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class FileWriterDemo11 {
    public static void main(String args[]) {
        Random random = new Random();
        int x;
        try {
            FileWriter fw = new FileWriter("E:\\1.txt",true);
            for (int i = 1; i <= 1000000; i++) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 1; j <= 20; j++) {
                    x = random.nextInt(26) + 65;
                    stringBuffer.append((char) x);
                }
                fw.write(stringBuffer + "\n");
            }
            fw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
