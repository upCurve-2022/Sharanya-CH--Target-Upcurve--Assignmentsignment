import java.util.Scanner;
import java.lang.Math;

public class Answer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        double num=in.nextDouble();
        int wholenumpart=(int)num;
        double fractionpart=num-wholenumpart;
        System.out.print(wholenumpart+" "+fractionpart);
    }
}
