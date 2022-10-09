package interface_Impl;

public class InterfaceImpl implements Intr {

    @Override
    public String sayHello(String name) {
        System.out.println("Welcome "+name);
        return name;
    }
}
