import java.util.Scanner;
public class anyTable {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
            int tablenumber=scn.nextInt();
            for(int num=1;num<=10;num++)
            {
                System.out.println(tablenumber +"X"+ num +"="+ tablenumber*num);
            }
            scn.close();
        }
    }
    
