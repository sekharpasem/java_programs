package nested.classes;

public class InnerClassA {
    private int a;

    public InnerClassA(){
        System.out.println("Innerclassa constructor...");
    }
    public InnerClassA(int a){
        System.out.println("Innerclassa one param constructor...");
        this.a = a;
    }

    public void print(){
        System.out.println("InnerClassA print a = "+this.a);
    }

    public class InnerClassB {

        int b;

        public InnerClassB(){
            System.out.println("InnerClasssB constructor");
        }
        public InnerClassB(int d){
            System.out.println("InnerClasssB one param constructor");
            this.b = d;
        }
        public void print(){
            System.out.println("InnerClassB print b = "+this.b);
            System.out.println("InnerClassB print a = "+a);
        }

        public class D{
            int d;
        }

    }

    public class  C{
        int i;
        int j;
        C(int i, int j){
            System.out.println("C two parameterized constructor..");
            this.i = i;
            this.j = j;

        }
        public void print(){
            System.out.println("C print i = "+this.i);
            System.out.println("C print j = "+this.j);
        }
    }

}
