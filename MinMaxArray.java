import java.util.Scanner;
class MinMaxArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0], max=a[0];
        for(int i=0;i<n;i++){
            if (a[i]<min) {
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximumn element of the array is:"+max); 
        System.out.println("minimum element of the array is:"+min);   
    }
}