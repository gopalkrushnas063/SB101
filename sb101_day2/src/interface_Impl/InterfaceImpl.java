package interface_Impl;

public class InterfaceImpl implements Intr {

    @Override
    public void sayHello(String name) {
        System.out.println("Welcome "+name);
    }
}
