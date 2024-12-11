import java.util.Scanner;
class occurence
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the target number");
        int target=sc.nextInt();


        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        
        
        System.out.println("the target\t"+target+"occured for\t"+count+"times");
    }
}

