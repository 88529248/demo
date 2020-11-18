package com.example.demo.sort;

public class InsertSort {
    /**
     * 插入排序：假定第一个元素是有序的，从第二个元素开始，
     * 在已经排好的元素序列中从后往前扫描，如果某个元素大于目标元素，
     * 则将该元素移到下一位置
     */

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 8, 7, 2, 6, 9};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    /**
     * @param
     */
    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int num = a[i];
            int j;
            for (j = i; j > 0 && num < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = num;
        }

    }

}
