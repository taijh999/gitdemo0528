import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3777 {
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("e:/word111.txt"));
		} catch (Exception e) {
			sc = new Scanner(System.in);
		}
		Map<String, Map<String, String>> codeMap = new HashMap<>();

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			String name = sc.next();
			codeMap.putIfAbsent(name, new LinkedHashMap<>(1));
			codeMap.get(name).put(sc.next(), sc.next());

		}
		String pName = sc.next();
		Map<String, String> cityCodeMap = codeMap.get(pName);
		for (String key : cityCodeMap.keySet()) {
			System.out.printf("%s %s\n", key, cityCodeMap.get(key));
		}
	}

}