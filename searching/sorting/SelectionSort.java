package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 3, 1, 5, 6, 5, 2 };
        System.out.println("Before sorting : " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println("After sorting : " + Arrays.toString(a));
    }
}
