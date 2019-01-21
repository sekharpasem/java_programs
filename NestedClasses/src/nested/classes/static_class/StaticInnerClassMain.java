package nested.classes.static_class;


public class StaticInnerClassMain {
    public static void main(String[] args) {
        StaticClassesA a = new StaticClassesA();
        a.print();
        System.out.println("In main a.i = "+a.i);


        StaticClassesA.B b = new StaticClassesA.B();
        b.print();
        System.out.println("In main b.j = "+b.j);

    }
}
