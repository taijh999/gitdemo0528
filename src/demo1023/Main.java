package demo1023;
import java.util.Scanner;
//public class JavaApplication23 {
 
public class Main {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
       
        for(int i = 1;i <= s.length();i++) 
        {
            try{
            if(s.charAt(i)!='.')
            {
            char s1=s.charAt(i);
            System.out.print(Integer.toBinaryString(s1));
            }
            else
                System.out.print(s.charAt(i));  
            }
            catch(StringIndexOutOfBoundsException e){
                 
            }
            }
        }
    }
 