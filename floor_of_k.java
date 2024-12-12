
// Given a sorted array arr[] (with unique elements) and an integer k,
//  find the index (0-based) of the largest element in arr[] that is less than or equal to k. 
//  This element is called the "floor" of k. If such an element does not exist, return -1.


import java.util.Scanner;
public class floor_of_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the any integer");
        int k=sc.nextInt();


        int high=n-1;
        int low=0;
        int floor_index=-1;
        for(;low<=high;){
            int mid = low + (high - low) / 2;
            if (arr[mid] <= k) {
                floor_index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        if (floor_index != -1) {
            System.out.println("The floor of k is present at index: " + floor_index);
            System.out.println("The floor of k is: " + arr[floor_index]);
        } 
        else
         {
            System.out.println(-1);
        }
    }
}