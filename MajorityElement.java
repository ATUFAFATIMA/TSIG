import java.util.Scanner;
public class MajorityElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean majorityelement=false;
        for(int i=0;i<n;i++)
        {
            int majoritycount=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    majoritycount++;
                }
            }
            if(majoritycount>(n/2)){
                System.out.println("majority element is:"+arr[i]);
                majorityelement=true;
                break;
            }
        }
        if(majorityelement==false){
            System.out.println(-1);
        }
    }
}
