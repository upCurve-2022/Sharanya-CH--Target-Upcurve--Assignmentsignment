import java.util.Scanner;

public class Answer8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum_odd=0,sum_even=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum_even+=i;
            }
            else{
                sum_odd+=i;
            }
        }
        System.out.println("even sum:"+sum_even);
        System.out.println("odd sum:"+sum_odd);
    }
}
