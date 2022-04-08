import java.util.*;

public class Answer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=in.nextLine();
        String ns=new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                if((Character.isDigit(s.charAt(i-1))) &&(Character.isDigit(s.charAt(i+1)))){
                    ns=s.replace('-',' ');
                }
            }
        }
        System.out.println(ns);
    }
}
