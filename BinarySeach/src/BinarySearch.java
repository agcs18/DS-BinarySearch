
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int i = 0;
        while (i < size) {
            arr[i] = sc.nextInt();
            i += 1;
        }
        BinarySearch obj = new BinarySearch();
        System.out.println("Enter element to find ");
        int elem = sc.nextInt();
        obj.BinarySearch_It(arr, 0, arr.length - 1, elem);

    }

    public void BinarySearch_It(int arr[], int low, int high, int elem) {
        System.out.println("hi");
        int position = 0;
        while (low <= high) {
            //{1,2,3,4,5,6}
            int mid = (low + high) / 2;

            if (elem == arr[mid]) {
                System.out.println("element found at " + (mid + 1) + " position");
                position += mid;
                break;
            } else if (elem < arr[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }
        if (position == 0) {
            System.out.println("Element Not found");
        }
    }
}
