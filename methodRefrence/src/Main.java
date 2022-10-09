public class Main {

    public static void fun1(String s){
        System.out.println("Inside static fun1 of Main");
        System.out.println("The value of s is : "+s );
    }

    public void fun2(String s){
        System.out.println("Inside non-static fun2 of Main");
        System.out.println("The value of s is : "+s );
    }


    public Main(String s){
        System.out.println("Inside Constructor of Main");
        System.out.println("The value of s is : "+s );
    }


    public static void main(String[] args) {
        Intr i1 =  msg-> System.out.println("Welcome "+msg);
        i1.sayHello("Gopu");

        Intr i2 = Main::fun1; // Referencing to static method
        i2.sayHello("Welcome to Method Reference static method");


//        Intr i3 = new Main()::fun2;
//        i3.sayHello("Non-Static MR");

        Intr i4 = new Main("Rajesh non-static method")::fun2;// Referencing to non-static method

        Intr i5 = Main::new;
        i5.sayHello("Ranjan Constructor");
    }
}