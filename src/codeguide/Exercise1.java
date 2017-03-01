package codeguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		/* create list1 and list2 */
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		List<String> list2 = Arrays.asList("c", "d", "e", "f");

		// TODO Complete the same task using existing APIs.
		addAll(list1, list2);
		System.out.println(contains(list1, list2.get(0)));

	}

	/* Check if list contains object o. */
	public static boolean contains(List<String> list, Object o) {
		for (String s : list) {
			if (s.equals(o)) {
				return true;
			}
		}
		return false;
	}

	/* Add elements from l2 to l1 */
	public static void addAll(List<String> l1, List<String> l2) {
		for (String s : l2) {
			l1.add(s);
		}
	}

}
