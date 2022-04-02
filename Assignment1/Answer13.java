import java.util.Scanner;
import java.lang.Math;

public class Answer13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i+=1) {
            System.out.print((int)Math.pow(i,i) + " ");
        }
    }
}
