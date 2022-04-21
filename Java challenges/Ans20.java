public class Ans20 {
    public static void main(String args[]) {
        //a java program to replace ‘a’ with ‘$’ in the following String
        String s="I am always ready to learn although I do not always like being taught.";
        String result=new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                result+='$';
            }
            else{
                result+=s.charAt(i);
            }
        }
        System.out.println(result);

        //using replace() method
        String string=new String();
        string=s.replace('a','$');
        System.out.println(string);
    }
}
