package dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 3, 1, 5, 6, 5, 2 };
        System.out.println("Before Sorting : " + Arrays.toString(a));
        System.out.println("After Sorting : " + Arrays.toString(mergesort(a)));
    }

    public static int[] mergesort(int a[]) {

        if (a.length == 1)
            return a;
        int mid = a.length / 2;

        int left[] = mergesort(Arrays.copyOfRange(a, 0, mid));
        int right[] = mergesort(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int join[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                join[k++] = left[i++];
            else
                join[k++] = right[j++];
        }
        while (i < left.length) {
            join[k++] = left[i++];
        }
        while (j < right.length) {
            join[k++] = right[j++];
        }

        return join;

    }
}
