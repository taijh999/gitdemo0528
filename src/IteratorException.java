import java.util.ArrayList;
import java.util.Iterator;

public class IteratorException {

	public static void main(String[] args) {

		ArrayList<String> slist = new ArrayList<>();
		slist.add("1");
		slist.add("2");
		slist.add("3");
		

		Iterator<String> itr = slist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.next());

	}
}