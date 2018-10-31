import java.io.FileInputStream;
import java.util.Scanner;

public class Main3677 {
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new FileInputStream("C:/Users/tai/Downloads/test0.in"));
		} catch (Exception e) {
			in = new Scanner(System.in);
		}
		int p = 0;
		String s2 = "";
		String s1 = "";

		while (in.hasNext()) {
			p = 0;
			s1 = in.next();
			s2 = in.next();
			String s11 = s1.toLowerCase();
			String s22 = s2.toLowerCase();
			for (int i = 0; i < s22.length(); i++) {
				if (s22.charAt(i) == s11.charAt(0))
					p++;
			}
			float s = (float) p / (float) s2.length();
			System.out.println(String.format("%.5f", s));

		}
		in.close();
		
	}
}