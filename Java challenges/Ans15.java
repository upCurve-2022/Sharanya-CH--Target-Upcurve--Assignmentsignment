//a java program to print all the permutations of String “GOD”.
public class Ans15 {
    static void permutation(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left_substr=s.substring(0,i);
            String right_substr=s.substring(i+1);
            String rest=left_substr+right_substr;
            permutation(rest,ans+ch);
        }
    }
    public static void main(String args[]) {
        System.out.println("All the permutations of GOD are:");
        permutation("GOD","");
    }
}
