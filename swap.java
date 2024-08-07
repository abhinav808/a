/* swap two numbers in java*/
import java.util.Scanner; /*used to take input */
class Codec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the value of a:");
        int a=sc.nextInt();
        
        System.out.print("enter the value of b:");
        int b=sc.nextInt();
        
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("new value for a is "+a);
        System.out.println("new value for b is "+b);
        
    }



}
