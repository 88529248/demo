package com.example.demo.sort;

public class SelectionSort {
	/**
	 * 选择排序（Selectionsort）是一种简单直观的排序算法。 它的工作原理如下。首先在未排序序列中找到最小（大）元素，
	 * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素， 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] s = { 1, 4, 5, 3, 8, 7, 2, 6, 9 };
		sort(s);
		for (int i : s) {
			System.out.println(i);
		}
	}

	private static void sort(int[] s) {
		for (int i = 0; i < s.length; i++) {
			int minIdnex = i;
			for (int j = i + 1; j < s.length; j++) {
				if (s[minIdnex] > s[j]) {
					minIdnex = j;
				}
			}
			if (minIdnex != i) {
				int temp = s[i];
				s[i] = s[minIdnex];
				s[minIdnex] = temp;

			}
		}

	}

}
