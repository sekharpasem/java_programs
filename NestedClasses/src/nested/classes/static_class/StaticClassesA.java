package nested.classes.static_class;

public class StaticClassesA {
    int i = 10;

    public void print(){
        System.out.println("Outer class A i = "+i);
    }

    public static class B{
        int j = 15;
        public void print(){
            System.out.println("Inner Class B j = "+j);
        }
    }
}
