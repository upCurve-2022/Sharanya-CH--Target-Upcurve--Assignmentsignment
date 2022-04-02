import java.util.Scanner;

public class Answer18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial=1;
        while(n>0){
            factorial*=n;
            n--;
        }
        System.out.println(factorial);
    }
}
