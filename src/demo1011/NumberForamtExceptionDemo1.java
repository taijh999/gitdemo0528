/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1011;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 * 运用图形界面的加法运算
 */
public class NumberForamtExceptionDemo1 {

    public static void main(String args[]) {

        String s1 = JOptionPane.showInputDialog(null, "input a integer"); //"123"
        String s2 = JOptionPane.showInputDialog(null, "input a integer");  //"456"
        int sum=0;
        boolean f=true;
        try{
        
        int x = Integer.parseInt(s1); //1w数字格式异常对象
        int y = Integer.parseInt(s2); //NumberFormatException 
         sum = x + y;
        }catch(NumberFormatException e){
            
            //System.out.println(e.getMessage());
            System.out.println("数字格式错误");
            f=false;
            
            
        }
        if(f){
        
        JOptionPane.showMessageDialog(null, sum);
        }
    }
}
