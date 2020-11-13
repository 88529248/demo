package com.example.demo.sort;

public class BubbleSort {
	/**
	 * 冒泡排序
	 * 
	 */
	public static void main(String[] args) {
		int[] sums = { 1, 4, 5, 3, 8, 7, 2, 6, 9 };
		sort(sums);
		for (int i : sums) {
			System.out.println(i);
		}
	}

	static void sort(int[] sums) {
		for (int i = 0; i < sums.length - 1; i++) {
			for (int j = 0; j < sums.length - i - 1; j++) {
				if (sums[j] > sums[j + 1]) {
					int temp = sums[j];
					sums[j] = sums[j + 1];
					sums[j + 1] = temp;
				}

			}
		}
	}
}
