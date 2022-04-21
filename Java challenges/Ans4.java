import java.util.*;
public class Ans4 {
    //a java program to find the ASCII value of the character.
    public static int Ascii_method1(char c){
        //Assigning a char variable to the int variable
        int ascii1=c;
        return ascii1;
    }
    public static int Ascii_method2(char c) {
        //using type casting
        int ascii2=(int)c;
        return ascii2;
    }

    public static void main(String args[]){
        System.out.println("Enter a character:");
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        System.out.println("The ASCII value of "+ch+" is: "+Ascii_method1(ch));
        System.out.println("The ASCII value of "+ch+" is: "+Ascii_method2(ch));
    }
}
