package com.example.demo.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] sums = { 1, 4, 5, 3, 8, 7, 6, 9 };
		sort(sums, 0, sums.length - 1);
		System.out.println(Arrays.asList(sums).toString());
	}

	static void sort(int[] sums, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			sort(sums, low, mid);
			sort(sums, mid + 1, high);
			merge(sums, low, mid, high);
		}

	}

	static void merge(int[] sums, int mid, int low, int high) {

	}

}
