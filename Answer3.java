import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //using matches() method and regular expression
        boolean result=s.matches("[0-9]+");
        if(result==true) {
            System.out.println("the given string "+s+" contains only digits");
        }
        else{
            System.out.println("the given string "+s+" contains digits and alphabets");
        }
    }

}
