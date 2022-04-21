import java.util.Scanner;

public class Ans19 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //a java program to check whether given number is an ugly number.
        //In number system, ugly numbers are positive numbers whose only prime factors are 2,3,5.
        System.out.println("Enter a number:");
        int number=in.nextInt();
        int num=number;
        if(num<0){
            System.out.print("enter a positive number");
        }
        else{
            while(num>1){
                if(num%2==0){
                    num/=2;
                }
                else if(num%3==0){
                    num/=3;
                }
                else if(num%5==0){
                    num/=5;
                }
                else{
                    System.out.println(number+" is not a ugly number.");break;
                }
            }
            if(num==1) {
                System.out.println(number + " is a ugly number.");
            }
        }
    }
}
