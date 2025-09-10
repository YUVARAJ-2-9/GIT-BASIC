import java.util.Scanner;
public class Odd{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        int num =obj.nextInt();
        if(num%2==0){
            System.out.println("the num is even");
        }
        else{
            System.out.println("the num is odd");
            obj.close();
        }
        }
    }

