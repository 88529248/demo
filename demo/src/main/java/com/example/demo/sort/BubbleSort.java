package com.example.demo.sort;

public class BubbleSort {
    /**
     * https://www.cnblogs.com/morethink/p/8419151.html
     * 冒泡排序
     * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 3.针对所有的元素重复以上的步骤，除了最后一个。
     * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public static void main(String[] args) {
        int[] sums = {1, 4, 5, 3, 8, 7, 2, 6, 9};
        sort(sums);
        for (int i : sums) {
            System.out.println(i);
        }
    }

    static void sort(int[] sums) {
        for (int i = 0; i < sums.length - 1; i++) {  //控制循环次数
            for (int j = 0; j < sums.length - i - 1; j++) {  //控制循环到达位置
                if (sums[j] > sums[j + 1]) {
                    int temp = sums[j];
                    sums[j] = sums[j + 1];
                    sums[j + 1] = temp;
                }

            }
        }
    }
}
