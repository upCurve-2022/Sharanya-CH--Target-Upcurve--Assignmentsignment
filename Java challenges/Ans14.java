import java.util.Scanner;

public class Ans14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = in.nextLine();
        System.out.println("Enter another string:");
        String s2 = in.nextLine();
        if(s1.contains(s2)){
            System.out.println(s1+" contains "+s2);
        }
        else{
            System.out.println(s1+" does not contains "+s2);
        }
    }
}
