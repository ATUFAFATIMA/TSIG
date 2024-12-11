import java.util.Scanner;
class EvenOddCount{
    public static void main(String args[])
    {
        int num,rem,evencount=0,oddcount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of your choice");
        num=sc.nextInt();
        while (num!=0) 
        {
            rem=num%10;
            if(rem%2==0)
            {
                evencount++;
            }    
            else{
                oddcount++;
            }
            num=num/10;
        }
        System.out.println("even count is:"+evencount);
        System.out.println("odd count is:"+oddcount);
    }
}