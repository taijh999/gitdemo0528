/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cn.byau.cs;



/**
 *
 * @author Administrator
 */
public class StudentArrayTest {
    public static void main(String args[]){
       Student students[]=new Student[3];
       students[0]=new Student("123","li",90);
       students[1]=new Student("124","zhang",77);
       students[2]=new Student("125","wang",78);
         int sum=0;
       
       for(int i=0;i<=students.length-1;i++){
              System.out.println(students[i].getNo());
          }
       for(int i=0;i<=2;i++){
             sum=sum+students[i].getScore();
          }
       System.out.println(sum);
       
        for(Student s:students){
              System.out.println(s.getNo());
          }
        sum=0;
        for(Student s:students){
             sum=sum+s.getScore();
          }
       
         System.out.println(sum);
          
          
    }
}
