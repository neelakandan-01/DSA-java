package dsa.searching;

import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Enter the key Element..");
        int key = sc.nextInt();

        if (key == binary(key, a, 0, a.length)) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is Not Present");
        }

    }

    public static int binary(int key, int a[], int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            int midd = a[mid];
            if (midd == key)
                return a[mid];
            else if (midd > key)
                return binary(key, a, start, mid - 1);
            else if (midd < key)
                return binary(key, a, mid + 1, end);
        }
        return -1;
    }
}
