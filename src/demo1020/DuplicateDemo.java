package demo1020;

public class DuplicateDemo {

	public static void main(String args[]) {
		boolean dupp = false; // Assume there are no duplicates
		String lines[] = new String[] { "zhangsan", "lisi", "lisi", "wangwu" };
		for (int i = 0; i < lines.length - 1; i++) {
			if (lines[i].equals(lines[i + 1])) {
				dupp = true; // we have found a duplicate!
				break;
			}
		}
		if (dupp) {
			System.out.println("����Ԫ�����ظ�");
		} else {
			System.out.println("����Ԫ��û���ظ�");
		}
	}
}
