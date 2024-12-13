import java.util.Scanner;

public class fib_no_recurrsion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many terms you want");
        int n=sc.nextInt();
        fib(n);

    }

    public static void fib (int n) {
        System.out.println();
        int a=0;
        int b=1;
        int terms_printed=2;
        if(n!=0 && n!=1){

            System.out.print(a+"\t"+b+"\t");
            while(terms_printed!=n){
                int c=a+b;
                System.out.print(c+"\t");
                a=b;
                b=c;
                terms_printed++;
            }
        }
        else if(n==1){
            System.out.println(0);
        }
        else{
            System.out.println("not a valid number");
        }

        
        }
    }
    

