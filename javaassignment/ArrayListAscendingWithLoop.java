package javaassignment;

import java.util.ArrayList;

public class ArrayListAscendingWithLoop {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(40);
		intList.add(30);
		intList.add(20);
		intList.add(5);

		System.out.println("before sorting" + intList);
		arraySort(intList);
		System.out.println("after sorting" + intList);
	}

	public static void arraySort(ArrayList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

}

