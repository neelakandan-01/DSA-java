package dsa.searching;

/**
 * LinearSearch
 */
import java.util.*;;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int n[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element : ");
            n[i] = sc.nextInt();
        }

        System.out.println("Enter the key : ");
        int key = sc.nextInt();

        String result = "Not Present";
        for (int i = 0; i < n.length; i++) {
            if (key == n[i]) {
                result = "Present";
                break;
            }
        }
        System.out.println(result);
    }
}