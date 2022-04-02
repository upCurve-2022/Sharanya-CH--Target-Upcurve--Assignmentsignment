import java.util.Scanner;

public class Answer19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int decimal=in.nextInt();
        int[] binary=new int[40];int i=0;
        while(decimal!=0){
            binary[i++]=decimal%2;
            decimal/=2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
