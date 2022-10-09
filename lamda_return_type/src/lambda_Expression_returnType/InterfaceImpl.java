package lambda_Expression_returnType;

public class InterfaceImpl implements Intr{

    @Override
    public String sayHello(String name) {
        return "Welcome "+name.toUpperCase();
    }
}
