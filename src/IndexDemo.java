import java.util.Scanner;

public class IndexDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(str.charAt(str.length() - 1));
		sc.close();
	}

}