package com.example.demo.sort;

public class InsertSort {
    /**
     * 插入排序：假定第一个元素是有序的，从第二个元素开始，
     * 在已经排好的元素序列中从后往前扫描，如果某个元素大于目标元素，
     * 则将该元素移到下一位置
     * 选择排序的区别： 选择排序是从未排序中选择最小值直接放在已排序
     * 后边，插入是按顺序从未排序中取值，然后比大小插入有序队列
     */

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 8, 7, 2, 6, 9};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

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
