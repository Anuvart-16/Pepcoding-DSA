import java.util.Scanner;
public class isPrime {
 public static void main(String[] args) {
     int fact = 0;
     Scanner scn = new Scanner(System.in);
     {
        int num = scn.nextInt();
         for(int div=2;div*div<=num;div++)
         {
             if(num%div==0)
             {
                 fact=fact+1;
                 break;
             }
            
         }
         if(fact==0)
         {
             System.out.println(num + " is Prime");
         }   else
 {
        System.out.println(num + " is not Prime");
 }
    }
    scn.close();
}
}