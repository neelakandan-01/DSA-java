package dsa.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 3, 1, 5, 6, 5, 2 };
        System.out.println("Before Sorting : " + Arrays.toString(a));
        quicksort(a, 0, a.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(a));
    }

    public static void quicksort(int a[], int li, int hi) {
        if (li >= hi)
            return;

        int start = li, end = hi, mid = (start + end) / 2;
        int pivot = a[mid];
        while (start <= end) {
            while (pivot > a[start])
                start++;
            while (pivot < a[end])
                end--;
            if (start <= end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(a, li, end);
        quicksort(a, start, hi);
    }
}
