package com.example.demo.sort;

public class InsertSorting {

	public static void main(String[] args) {
		int[] sums = { 1, 4, 5, 3, 8, 7, 2, 6, 9 };
		sort(sums);
		for (int i : sums) {
			System.out.println(i);
		}
	}

	/**
	 * @param sums 0302
	 */
	static void sort(int[] sums) {
		for (int i = 1; i < sums.length; i++) {
			int indexValue = sums[i];
			int index = i;
			while (index > 0 && indexValue < sums[index - 1]) {
				sums[index] = sums[index - 1];
				index--;
			}
			sums[index] = indexValue;
		}
	}

}
