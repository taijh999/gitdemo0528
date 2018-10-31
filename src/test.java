public class test {
	public static void main(String[] args) {
		char[] a = { 'ÎÒ', '°®', 'Äã' };
		for (int i = 0; i < 3; i++) {
			System.out.print(a[i] + " " + (int) a[i]);
			System.out.println(" " + (char) (a[i] + 1));
		}
		
		
	}
}