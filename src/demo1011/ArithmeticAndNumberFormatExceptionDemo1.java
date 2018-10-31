/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1011;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator 运用图形界面的加法运算
 */
public class ArithmeticAndNumberFormatExceptionDemo1 {

    public static void main(String args[]) {

        String s1 = JOptionPane.showInputDialog(null, "input a integer"); //"123"
        String s2 = JOptionPane.showInputDialog(null, "input a integer");  //"456"
        int sum = 0;
        int flag = 1;

        try {
            int x = Integer.parseInt(s1); //1w数字格式异常对象
            int y = Integer.parseInt(s2);
            sum = x / y;
        } catch (NumberFormatException e) {

            flag = 2;

        } catch (ArithmeticException e) {

            flag = 3;
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, sum);
        } else if (flag == 2) {
            JOptionPane.showMessageDialog(null, "数字格式问题");
        } else if (flag == 3) {
            JOptionPane.showMessageDialog(null, "除数为0");
        }
    }
}
