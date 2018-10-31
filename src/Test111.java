import java.util.Arrays;
import java.util.Scanner;

public class Test111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			sum = sum + arr[i];
		}
		Arrays.sort(arr);
		System.out.println(sum);
		System.out.println(arr[arr.length-1]);

	}
}
