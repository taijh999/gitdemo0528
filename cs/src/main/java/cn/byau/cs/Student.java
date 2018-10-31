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
public class Student {
    private String no;
    private String name;
    private int score;
    public Student(String no,String name,int score){
        this.no=no;
        this.name=name;
        this.score=score;
    }
   
    
    public String getNo(){
        return no;
    }
    public int getScore(){
        return score;
    }
    public void setNo(String no){
        this.no=no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        if(score<0){
            this.score=-score;
        }else{
            this.score=score;
        }
    }
    public  void printInfo(){
        System.out.println("no="+
                no+"name="+name+"score="+score);
    }
}
    

