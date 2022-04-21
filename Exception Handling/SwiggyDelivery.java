import java.lang.*;
import java.util.Scanner;

public class SwiggyDelivery {
    public static void check_zipcode(int code)throws InvalidZipCode{
        if(code==123 ||code==456 ||code==789){
            //since the customer resides at a non-deliverable zip code, we are throwingn a custom exception.
            throw new InvalidZipCode("Sorry!! Delivery is not available in your area.");
        }
        else{
            System.out.println("Delivery is available in your area! ");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int Zipcode=in.nextInt();
        try{
            check_zipcode(Zipcode);
        }
        catch(InvalidZipCode ex){
            System.out.println("Exception caught:"+ex);
        }
    }
}
