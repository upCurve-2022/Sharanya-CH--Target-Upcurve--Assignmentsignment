import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s.isEmpty()){
            System.out.println("String is empty");
        }
        else{
            System.out.println("String is not empty");
        }
    }
}
