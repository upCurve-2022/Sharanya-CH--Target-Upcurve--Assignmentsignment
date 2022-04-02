import java.util.Scanner;

public class Answer26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();int flag=1;int i,j;
        for (i = 0,j=str.length()-1; i <=j; i++,j--) {
            if(str.charAt(i)!=str.charAt(j)){
                flag=0;
                break;
            }
        }
        if(flag==0){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
    }
}
