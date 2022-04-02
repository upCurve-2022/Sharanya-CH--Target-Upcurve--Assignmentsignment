import java.util.Scanner;

public class Answer23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int temp1=1;
        int temp2=-2;
        for(int i=1;i<=n;i++){
            System.out.print(temp1+",");
            System.out.print(temp2+",");
            temp1+=3;
            temp2+=(-4);
        }
    }
}
