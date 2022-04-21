import java.io.*;
import java.util.*;

public class Ans10 {
    //a java program to copy data from one file to another file
    public static void copydata(File f1,File f2)throws Exception{
        //for copying data we use FileInputStream and FileOutputStream classes
        //FileInputStream uses read() method to read the data from file1
        //FileOutputStream uses write() method to write the copied data from file1 to fil2

        //creating the instances for 2 classes
        FileInputStream fin=new FileInputStream(f1);//reads f1 contents
        FileOutputStream fout=new FileOutputStream(f2);//copies data to f2

        try{
            int i;//for indexing
            while((i=fin.read())!=-1)
                fout.write(i);
        }
        catch (Exception e){
            System.out.println("Error found:"+e.getMessage());
        }
        finally{
            if(fin!=null){
                fin.close();
            }
            if(fout!=null){
                fout.close();
            }
        }
        System.out.println("contents copied.");
    }
    public static void main(String args[])throws Exception{
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name of the file from where we want to copy the data:");
        String file1=in.nextLine();

        //creating an instance of file
        File f1=new File("C:\\Users\\shara\\OneDrive\\Desktop\\Target-Upcurve\\"+file1);

        System.out.println("enter the name of the file where we want to store the copied data:");
        String file2=in.nextLine();

        File f2=new File("C:\\Users\\shara\\OneDrive\\Desktop\\Target-Upcurve\\"+file2);

        copydata(f1,f2);
    }
}
