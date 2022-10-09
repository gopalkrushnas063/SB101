package interface_Impl;

public class Demo {
    public static void main(String[] args) {

        //using external class
        Intr i1 = new InterfaceImpl();
        i1.sayHello("Ram.");

        // Anonymous Inner Class
        Intr i2 = new Intr() {
            @Override
            public String sayHello(String name) {
                System.out.println("Welcome Using Anonymous Inner Class "+name);
                return name;
            }
        };

        i2.sayHello("Madan.");

        //using Lambda
        Intr i3 = name -> System.out.println("Welcome Using Lambda Expression "+name);
        i3.sayHello("Gopal.");

    }
}
