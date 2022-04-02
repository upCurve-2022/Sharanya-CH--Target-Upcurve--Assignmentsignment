import java.util.Scanner;
import java.lang.Math;
public class Answer27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=n;
        int sum=0;int num;
        while(n!=0){
            num=n%10;
            sum+=Math.pow(num,3);//3 digit number
            n/=10;
        }
        if(m==sum){
            System.out.println(m+" is Armstrong number");
        }
        else{
            System.out.println(m+" is not Armstrong number");
        }
    }
}
