package lambda_return_integer;


public class IntrImpl implements IntegerInterface{

    @Override
    public String printResult(Integer i) {
        return i>=18 ? "Eligible" : "Not Eligible";
    }
}
