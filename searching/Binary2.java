package dsa.searching;

import java.util.Scanner;

public class Binary2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int li = 0, hi = a.length, mid = (li + hi) / 2;

        System.out.println("Enter the key element");
        int key = sc.nextInt();

        String result = "Not Present";
        while (li < hi) {
            mid = (li + hi) / 2;
            if (key == a[mid]) {
                result = "Present";
                break;
            } else if (key > a[mid]) {
                li = mid + 1;
            } else if (key < a[mid]) {
                hi = mid - 1;
            }
        }

        System.out.println("Key is : " + result);
    }
}
