import java.util.Scanner;

public class Answer22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=1;int f=0;
        int n0=0;
        if(n==1){
            System.out.println(n1);
        }
        for(int j=2;j<=n;j++){
            f=n0+n1;
            System.out.print(n1+" ");
            n0=n1;
            n1=f;
        }
        System.out.println(f);
    }
}
