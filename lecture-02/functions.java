import java.util.Scanner;
public class functions {
    //This is Scanner which is applicable in all functions i.e.Global variable
    public static Scanner scn = new Scanner(System.in);  
    //NO ARGUMENT AND NO RETURN TYPE FUNCTION        (1)
    // public static void printMessage() {
    //     System.out.println("Hello !");
    // }
    //NO ARGUMENT AND RETURN TYPE FUNCTION           (2)
    // public static void printTable(int num)
    // {
    //  for(int i=1;i<=10;i++)
    //      System.out.println(num +" X "+i+" = "+num*i);
      
    // }
    //ARGUMENT TYPE AND NO RETURN TYPE FUNCTION      (3)
    // public static int sumOfTwoNumber() {
    //     int a=scn.nextInt();
    //     int b=scn.nextInt();

    //     return (a+b);
    // }
    //ARGUMENT TYPE AND NO RETURN TYPE FUNCTION      (4)
    public static boolean isPrime(int num) {
        for(int i=2;i*i<=num;i++)
        {
            if((num%i)==0)
            return false;
        }
        return true;   
    }
    public static void main(String[] args)
    {
        // Scanner scn = new Scanner(System.in);
    // printMessage();                       (1)
    // int num=scn.nextInt();                (2)
    //   printTable(num);
    // int ans=sumOfTwoNumber();             (3)
    // System.out.println(ans);
    int num=scn.nextInt();
    // boolean ans=isPrime(num);             //   (4)
    // if(ans==true)
    if(isPrime(num)==true)
    {
        System.out.println("The number is prime");
    }
    else
    {
        System.out.println("The number is not Prime");
    }

    //   scn.close();
    }
}

