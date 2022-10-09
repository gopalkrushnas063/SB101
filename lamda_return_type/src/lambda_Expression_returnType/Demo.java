package lambda_Expression_returnType;

public class Demo {
    public static void main(String[] args) {
        Intr i1 = new InterfaceImpl();
        String result = i1.sayHello("Gopal");
        System.out.println(result);

        Intr i2 = name -> "Welcome "+name.toUpperCase();
        System.out.println(i2.sayHello("Rajendra"));

    }
}
