import java.util.Scanner;

public class Answer10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s,num_str="";
        s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                num_str+="One ";
            }
            else if(s.charAt(i)=='2'){
                num_str+="Two ";
            }
            else if(s.charAt(i)=='3'){
                num_str+="Three ";
            }
            else if(s.charAt(i)=='4'){
                num_str+="Four ";
            }
            else if(s.charAt(i)=='5'){
                num_str+="Five ";
            }
            else if(s.charAt(i)=='6'){
                num_str+="Six ";
            }
            else if(s.charAt(i)=='7'){
                num_str+="Seven ";
            }
            else if(s.charAt(i)=='8'){
                num_str+="Eight ";
            }
            else{
                num_str+="Nine ";
            }
        }
        System.out.println(num_str);
    }
}
