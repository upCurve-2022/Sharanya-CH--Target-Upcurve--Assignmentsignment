import java.io.File;
import java.io.IOException;

public class Ans8 {
    public static void main(String[] args){
        //using File.createNewFile() method
        //it belongs to java.io class
        //it returns a boolean value

        //creating a file object and passing path name as argument
        File file=new File("C:\\Users\\shara\\OneDrive\\Desktop\\Target-Upcurve\\example1.txt");
        boolean created;
        try{
            created=file.createNewFile();//creates a new file
            if(created){//if created is true
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
            }
            else{
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch(IOException e){
            e.printStackTrace();//prints exception if any
        }
    }
}

