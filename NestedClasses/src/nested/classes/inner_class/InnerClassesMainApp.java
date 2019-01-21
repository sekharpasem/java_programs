package nested.classes.inner_class;
public class InnerClassesMainApp {
    public static void main(String args[]){
        InnerClassesA a = new InnerClassesA();
        a.print();
        System.out.println("In main a.i = "+a.i);


        InnerClassesA.B b = a.new B();
        b.print();
        System.out.println("In main b.j = "+b.j);

    }
}
