import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = findCandidate(arr, n);

        if (isMajority(arr, n, candidate)) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println(-1);
        }
    }

    private static int findCandidate(int[] arr, int n) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }

    private static boolean isMajority(int[] arr, int n, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > n / 2;
    }
}

