
import java.util.Scanner;
public class search_target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the target element");
        int target=sc.nextInt();

        int not_present_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("target found at position:"+(i+1));
                break;
            }  
            else if(i==(n-1)){
                System.out.println("target not present");
            }
         }


    }
}
