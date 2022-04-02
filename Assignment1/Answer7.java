import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("first larger:"+a);
                if(b>c) {
                    System.out.println("second larger:" +b);
                }
                else{
                    System.out.println("second larger:" +c);
                }
            }
            else{
                System.out.println("first larger:"+c);
                System.out.println("second larger:"+a);
            }
        }
        else{
            if(b>c){
                System.out.println("first larger:"+b);
                if(a>c) {
                    System.out.println("second larger:" +a );
                }
                else{
                    System.out.println("second larger:" +c);
                }
            }
            else{
                System.out.println("first larger:"+c);
                System.out.println("second larger:"+b);
            }
        }
    }
}
