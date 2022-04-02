import java.util.Scanner;

public class Answer5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("The number "+num+" is even.");
        }
        else{
            System.out.println("The number "+num+" is odd.");
        }
    }
}
