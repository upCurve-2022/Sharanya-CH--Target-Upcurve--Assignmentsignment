import java.util.Scanner;
import java.lang.String;

public class Ans2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float r=in.nextFloat();
        float h=in.nextFloat();
        float volume=(float)Math.PI*r*h;
        System.out.printf("volume of cylinder: %.2f", volume);
    }
}
