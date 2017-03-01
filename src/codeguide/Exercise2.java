package codeguide;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 6, 7, 8, 9, 10 };
		Integer[] mergedArray = complexMerge(array1, array2);
		System.out.println(Arrays.toString(mergedArray));
		mergedArray = simpleMerge(array1, array2);
		System.out.println(Arrays.toString(mergedArray));
	}

	public static Integer[] simpleMerge(Integer[] array1, Integer[] array2) {
		// TODO Write the method body to merge 2 arrays and return the result.
		// Hint: Keep it simple.
		
		return null;
	}

	public static Integer[] complexMerge(Integer[] array1, Integer[] array2) {
		// TODO Find bugs and fix it. There are at least 2 bugs in this method.
		List<Integer> list1 = Arrays.asList(array1);
		List<Integer> list2 = Arrays.asList(array2);
		Integer[] result = new Integer[list1.size() + list2.size()];

		int index = 0;
		for (Iterator<Integer> it = list1.iterator(); it.hasNext();) {
			result[++index] = it.next();
		}

		for (Iterator<Integer> it = list1.iterator(); it.hasNext(); index++) {
			result[index] = it.next();
		}
		return result;
	}
}