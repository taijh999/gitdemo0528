import java.util.Random;
import java.util.Scanner;
public class Main1111 {
 
    public static void main(String[] args) throws Exception{
         
        Scanner in=new Scanner(System.in);
      
        Random random=new Random();
        String str62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int r=in.nextInt();
        random.setSeed(100);
        for (int i = 1; i <=r ; i++) {
             
            System.out.println(str62.charAt(random.nextInt(62)));
        }
    }
}