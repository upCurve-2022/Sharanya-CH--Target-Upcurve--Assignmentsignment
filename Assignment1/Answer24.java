import java.util.Scanner;

public class Answer24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int result=1;
        while(n-->0){
            result*=x;
        }
        System.out.println(result);
    }
}
