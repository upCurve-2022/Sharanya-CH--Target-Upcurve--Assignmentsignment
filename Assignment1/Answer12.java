import java.util.Scanner;

public class Answer12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            else{
                System.out.print(-i+" ");
            }
        }
    }
}
