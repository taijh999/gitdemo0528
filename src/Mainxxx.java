import java.util.Random;
import java.util.Scanner;

public class Mainxxx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Random r1 = new Random();

		r1.setSeed(100);
		int S[] = new int[37];
		for (int m = 1; m < 37; m++) {
			S[m] = m;

		}
		int n, temp;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 7; j++) {
				n = r1.nextInt(36) + 1;
				int b = S[n];
				if (b < 10)
					System.out.print("0" + b + " ");
				else
					System.out.print(b + " ");

				temp = S[S.length - 1 - j];
				S[S.length - 1 - j] = S[n];
				S[n] = temp;
				/*
				 * for(int l=1;l<37;l++) { System.out.print(S[l]+" "); }
				 * System.out.println();
				 */
			}
			System.out.println();

		}
	}
}