
import java.util.Scanner;
public class diamond_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows you want");
        int rows=sc.nextInt();

        if(rows%2==0){

            // for upper half
            for(int i=1;i<=rows/2;i++){
                for(int j=1;j<=((rows/2)-i);j++){
                    System.out.print(" "+"\t");
                }
                
                for(int j=1;j<=((2*i)-1);j++){
    
                    System.out.print("*"+"\t");
                }
                System.out.print("\n");
    
            }
    
            // for lower half
    
            for(int i=1;i<=(rows/2);i++){
                for(int j=1;j<=(i-1);j++){
                    System.out.print(" "+"\t");
                }
    
                for(int j=((rows)-i);j>=i;j--){
                    System.out.print("*"+"\t");
                }
                System.out.print("\n");
            }
        }

        else{
            // for upper half
            for(int i=1;i<=((rows/2));i++){
                for(int j=1;j<=((rows/2)-i+1);j++){
                    System.out.print(" "+"\t");
                }
                
                for(int j=1;j<=((2*i)-1);j++){
    
                    System.out.print("*"+"\t");
                }
                System.out.print("\n");
    
            }
    
            // for lower half
    
            for(int i=1;i<=(rows/2)+1;i++){
                for(int j=1;j<(i);j++){
                    System.out.print(" "+"\t");
                }
    
                for(int j=((rows)-i+1);j>=i;j--){
                    System.out.print("*"+"\t");
                }
                System.out.print("\n");
            }
        }
    }
}
