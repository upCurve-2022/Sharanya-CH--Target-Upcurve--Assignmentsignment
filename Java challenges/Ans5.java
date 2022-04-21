import java.util.*;
import java.lang.Math;
public class Ans5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        int num=(int)Math.sqrt(n);
        if((num*num)==n){
            System.out.println(n+" is a perfect square.");
        }
        else{
            System.out.println(n+" is not a perfect square.");
        }
    }
}
