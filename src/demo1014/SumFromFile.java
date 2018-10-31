/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1014;

import java.io.File;
import java.util.Scanner;

/**
 *计算文件中数字的和
 * @author Administrator
 */
public class SumFromFile {

    public static void main(String[] args) throws Exception {

     
        Scanner scanner1 = new Scanner(new File("E:\\20161001\\java2016\\2016-10-12\\111.txt"));
        long sum = 0;

        while (scanner1.hasNextInt()) {
           
                sum = sum + scanner1.nextInt();
            }

        System.out.println(sum);

    }
}
