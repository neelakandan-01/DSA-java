package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 3, 1, 5, 6, 5, 2 };
        System.out.println("Before Sorting : " + Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting : " + Arrays.toString(a));
    }
}
