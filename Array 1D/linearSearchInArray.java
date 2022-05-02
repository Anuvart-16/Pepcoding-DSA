import java.util.Scanner;
public class linearSearchInArray{
    public static Scanner scn=new Scanner (System.in);
    public static void findElement(int[] arr, int data)
     {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if (arr[i] == data){   
            System.out.println("Element is present at " + i + "index");    
            }
            else{
            System.out.println("Element is not present in array");
        }
    }
    }
    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] A = new int[n];
        int data = scn.nextInt();
        for (int i=0;i<n;i++){
            A[i]=scn.nextInt();
        }
        findElement(A, data);
    } 
}