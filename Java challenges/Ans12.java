import java.util.Scanner;

public class Ans12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=in.nextLine();
        System.out.println("Enter another string:");
        String s2=in.nextLine();

        //first method using '+'
        String s=s1+s2;
        System.out.println(s);

        //second method using concat() function
        String S=s1.concat(s2);
        System.out.println(S);

        //third method using StringBuilder class
        StringBuilder S1=new StringBuilder("hello");
        StringBuilder S2=new StringBuilder(" world");
        StringBuilder s3=S1.append(S2);
        System.out.println(s3.toString());//displays result

        //using format() method
        String s4=String.format("%s %s",s1,s2);
        System.out.println(s4.toString());

        //using join() method
        String s5=String.join(" ","hello","world");
        System.out.println(s5.toString());
    }
}
