package nested.classes;


public class Test {
    public static void main(String[] args) {


       InnerClassA a = new InnerClassA(5);
       a.print();

       InnerClassA.InnerClassB b = a.new InnerClassB(8);
       b.print();

       InnerClassA.C c= a.new C(96,65);
       c.print();


       InnerClassA.InnerClassB.D d = b.new D();
    }
}
