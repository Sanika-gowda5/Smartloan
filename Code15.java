import java.util.Scanner;


class Code15{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of elements:");

        // Input number of elements
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements:");

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is maximum
        int max = arr[0];

        // Find maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output
        System.out.println("Maximum element: " + max);
    }
}
