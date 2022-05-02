import java.util.Scanner;
 public class allPrimeNumberInRange {
     public static Scanner scn = new Scanner(System.in);
    public static boolean isPrime(int num) {
        for(int i=2;i*i<=num;i++)
        {
            if((num%i)==0)
            return false;
        }
        return true;   
    }
    public static void allPrimeInRange(int low,int high)
    {
        for(int num=low;num<=high;num++)
        {
            if(isPrime(num))
            {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        int a=scn.nextInt() ,b=scn.nextInt();
        allPrimeInRange(a,b);
    }    
}
    