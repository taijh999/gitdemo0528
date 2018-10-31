import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class Main{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner src = new Scanner(System.in);
        Random randoms = new Random();
        randoms.setSeed(100);
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int a,b;
        int n = src.nextInt();
        for(int i = 0;i<n;i++)
        {
            a = randoms.nextInt(9)+1;
            b = randoms.nextInt(9)+1;
            for(int j = 0;j<a;j++)
            {
                str1.append("¡ø");
            }
            for(int k = 0;k<b;k++)
            {
                str2.append("¡ø");
            }
            System.out.println(str1 + " " + str2 + "=?");
            str1.delete(0, str1.length());
            str2.delete(0, str2.length());
        }
    }
}