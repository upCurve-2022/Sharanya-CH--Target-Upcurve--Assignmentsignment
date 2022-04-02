import java.util.Scanner;

public class Answer28 {
    static int linearsearch(int a[],int n,int ele){
        for(int i=0;i<n;i++){
            if(a[i]==ele)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the element to be searched:");
        int k=in.nextInt();
        int index=linearsearch(arr,n,k);
        if(index==-1) {
            System.out.println("the element not found");
        }
        else{
            System.out.println("the element "+ k+" found at index "+index);
        }
    }
}
