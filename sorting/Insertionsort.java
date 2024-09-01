package dsa.sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 3, 1, 5, 6, 5, 2 };
        System.out.println("Before Sorting : " + Arrays.toString(a));

        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println("After Sorting : " + Arrays.toString(a));
    }
}
