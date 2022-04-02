import java.util.Scanner;

public class Answer21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(val+",");
                val=-1*(val-(i*i));
            }
            else{
                System.out.print(val+",");
                val=-1*(val+(i*i));
            }
        }
    }
}
