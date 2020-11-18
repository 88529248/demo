package com.example.demo.sort;

public class QuickSort {
    /**
     * 快速排序：选择一个基准值，从数组两边分别比较与基准值的大小
     * 左边比基准值大的移到右边，右边比基准值小的移到左边，递归重复动作
     */
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 8, 7, 2, 6, 9};
        sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static void sort(int[] a, int low, int high) {
        //已经排完
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;

        //保存基准值
        int pivot = a[left];
        while (left < right) {
            //从后向前找到比基准小的元素
            while (left < right && a[right] >= pivot) {
                right--;
            }
            a[left] = a[right];
            //从前往后找到比基准大的元素
            while (left < right && a[left] <= pivot) {
                left++;
            }
            a[right] = a[left];
        }
        // 放置基准值，准备分治递归快排
        a[left] = pivot;
        sort(a, low, left - 1);
        sort(a, left + 1, high);

    }

}
