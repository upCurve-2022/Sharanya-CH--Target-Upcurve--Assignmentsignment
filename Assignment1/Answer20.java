import java.util.Scanner;
import java.lang.Math;
public class Answer20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int binary=in.nextInt();
        int decimal=0;int n=0;
        while(binary!=0){
            int temp=binary%10;
            decimal+=temp*Math.pow(2,n);
            binary/=10;
            n++;
        }
        System.out.println(decimal);
    }
}
