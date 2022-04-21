import java.util.Scanner;

public class Ans13 {
    public static void main(String args[]) {
        //a java program to count the number words in a string.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=in.nextLine();
        String[] words=s.split(" ");
        System.out.println(words.length);
    }
}
