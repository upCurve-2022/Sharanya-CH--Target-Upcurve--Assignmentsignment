import java.util.Scanner;

public class Ans16 {
    public static void main(String args[]) {
        //a java program to print the duplicate characters of the string.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        char[] char_count=s.toCharArray();
        System.out.print("duplicate characters in string are:\n");
        for(int i=0;i<char_count.length;i++){
            int count=1;
            for(int j=i+1;j<char_count.length;j++){
                if(char_count[i]==char_count[j]){
                    count++;
                    char_count[j]='0';//to avoid printing visited char
                }
            }
            if(count>1&&char_count[i]!='0'){
                System.out.print(char_count[i]+" ");
            }
        }
    }
}
