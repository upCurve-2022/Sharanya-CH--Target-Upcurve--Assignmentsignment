import java.io.FileOutputStream;

public class Ans9 {
    public static void main(String[] args){
        try {
            FileOutputStream f = new FileOutputStream("C:\\Users\\shara\\OneDrive\\Desktop\\Target-Upcurve\\example.txt");
            f.write(94);//writing bytes
            String s = "hello welcome to target upcurve program";
            byte b[] = s.getBytes();//converting string to byte array
            f.write(b);//writing  a string
            f.close();
            System.out.println("sucess........");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
