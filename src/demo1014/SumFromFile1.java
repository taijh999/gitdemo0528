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
public class SumFromFile1 {

    public static void main(String[] args) throws Exception {

     
        Scanner scanner1 = new Scanner(new File("E:\\20161001\\java2016\\2016-10-12\\1.txt"));
        //long sum = 0;

        while (scanner1.hasNextLine()) {
           
               System.out.println(scanner1.nextLine());
            }

        //System.out.println(sum);

    }
}
