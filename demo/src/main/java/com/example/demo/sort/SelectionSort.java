package com.example.demo.sort;

public class SelectionSort {
    /**
     * 选择排序（SelectionSort）是一种简单直观的排序算法。
     * 它的工作原理如下。首先在未排序序列中找到最小（大）元素，
     * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，
     * 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     */
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 8, 7, 2, 6, 9};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    /**
     * 先选择一个最小值，放在第一位，然后从第一位后边再选择相对比较小的放在第二位，以此类推
     */
    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
                if (min != i) {
                    int temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }

            }

        }

    }


}
