public class Ans3 {
    public static void main(String[] args){
        //A pen costs 50$ and it is been sold at a discount of 12%
        int pen_cost=50;
        int discount_percentage=12;
        //to find discount amount and selling price
        int discount_amt=(discount_percentage*pen_cost)/100;
        System.out.println("The discount amount : "+discount_amt+"$");
        System.out.println("The selling Price: "+(pen_cost-discount_amt)+"$");
    }
}
