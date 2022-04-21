import java.util.*;

public class Ans7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //using for each loop
        int sum=0;float average;
        for(int num:arr){
            sum+=num;
        }
        average=sum/n;
        System.out.println("the average of given array is:"+average);
    }
}
