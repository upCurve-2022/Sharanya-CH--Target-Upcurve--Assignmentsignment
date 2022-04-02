import java.util.*;

public class Answer29 {
    static int binarysearch(int a[],int n,int ele){
        int low=0,high=n-1;
        while(low<high){
            int mid=(high+low)/2+low;
            if(a[mid]==ele){
                return mid;
            }
            else if(a[mid]<ele){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element to be searched:");
        int k = in.nextInt();
        Arrays.sort(arr);//for binary search arrays should be sorted
        int index = binarysearch(arr, n, k);
        if (index == -1) {
            System.out.println("the element not found");
        } else {
            System.out.println("the element " + k + " found at index " + index);
        }
    }
}
