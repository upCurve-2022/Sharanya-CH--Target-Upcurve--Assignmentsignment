import java.util.Scanner;

public class Answer5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //without builtin length()
        int count=0;
        for(char a:s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
