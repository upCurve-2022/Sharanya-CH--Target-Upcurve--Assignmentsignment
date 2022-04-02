import java.util.Scanner;

public class Answer17
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i=n;i<=m;i++){
            if(i>1){
                int p=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        p++;
                    }
                }
                if(p==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
