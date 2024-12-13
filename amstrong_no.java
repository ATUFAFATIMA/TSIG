
public class amstrong_no {
    public static void main(String[] args) {

        int i;
        for(i=1;i<=1000;i++)
        {
            if(amstrongNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean amstrongNumber(int i) {
        int rem,sum=0;
        int temp=i;
        while(temp>0){
            rem=temp%10;
            sum += Math.pow(rem,3);
            temp=temp/10;
        }
        return sum==i;

    }
    
}
