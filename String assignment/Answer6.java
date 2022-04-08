import java.util.*;

//a program to demonstrate ways to compare two Strings in Java
public class Answer6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=in.nextLine();
        System.out.println("Enter a string");
        String s2=in.nextLine();

        //using '=='
        String s3=s1;//s1 and s3 references to same object.
        System.out.println(s1==s2);//return false as s1 and s2 references different objects.
        System.out.println(s1==s3);//returns true

        //using equals()
        if(s1.equals(s2)){
            System.out.println(s1+" "+s2+" are equal.");
        }
        else{
            System.out.println(s1+" "+s2+" are not equal.");
        }

        //using equalsIgnoreCase()
        if(s1.equalsIgnoreCase(s2)){
            System.out.println(s1+" "+s2+" are equal.");
        }
        else{
            System.out.println(s1+" "+s2+" are not equal.");
        }

        //using compareTo()
        int t;
        t=s1.compareTo(s2);
        System.out.println("comparing "+s1+" "+s2+" : "+t);

    }
}
