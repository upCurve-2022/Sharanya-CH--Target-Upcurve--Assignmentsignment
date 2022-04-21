import java.util.Scanner;

public class Ans18 {
    public static int ternarylargest(int n1,int n2,int n3){
        int largest;
        largest=n3>(n1>n2?n1:n2)?n3:(n1>n2?n1:n2);
        return largest;
    }
    public static void main(String args[]) {
        //a java program to calculate the largest number from the given three numbers using ternary operator.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("largest of "+a+" "+b+" "+c+" is:"+ternarylargest(a,b,c));
    }
}
