import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //to show strings are immutable
        String str="Hello";
        str.concat("world");
        System.out.println(str);
        //here string str value doesn't change even though if we concatenate.
        //if we try to change the value of str then the reference changes.
    }
}
