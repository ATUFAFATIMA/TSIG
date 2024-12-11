import java.util.Scanner;

public class factorial {
    public static int FactCalculation(int num){
        if(num==0 || num==1){
            return 1;
        }
        else if(num<0){
            System.out.println("invalid number entered");

        }
        else{
            return num*FactCalculation(num-1);
        }
        return 0;
    }
    public static void main (String[] args) {
        int num,fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of your choice");
        num=sc.nextInt();
        fact=FactCalculation(num);
        if(fact!=0){

            System.out.println("the factorial of the number is:"+fact);
        }

    }
}
