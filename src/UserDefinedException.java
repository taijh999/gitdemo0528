class MyException extends Exception {
	private int detail;

	MyException(int a) {
		detail = a;
	}

	public String toString() {
		return "MyException[" + detail + "}";

	}
}

public class UserDefinedException {
	static void compute(int num) throws MyException {
		System.out.println("Called computer(" + num + "]");
		if (num < 10) {
			System.out.println("Number Is Less Than 10");
		} else
			throw new MyException(num);
	}

	public static void main(String args[]) {
		try {
			compute(9);
			compute(10);

		} catch (MyException me) {
			System.out.println("Caught " + me);
		}
	}
}