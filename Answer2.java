import java.util.Scanner;
import java.lang.*;
public class Answer2 {
    static void remove_k(String str,char k){
        String new_str="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.toLowerCase(c)!=k) {
                new_str+= str.charAt(i);
            }
        }
        System.out.println(new_str);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        char k=in.next().charAt(0);
        remove_k(s,k);
    }
}
