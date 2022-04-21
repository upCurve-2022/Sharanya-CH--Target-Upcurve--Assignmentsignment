//custom exception

public class InvalidZipCode extends Exception{
    public InvalidZipCode(String s){
        //passing s for error message
        //calling constructor of parent exception
        super(s);
    }
}
