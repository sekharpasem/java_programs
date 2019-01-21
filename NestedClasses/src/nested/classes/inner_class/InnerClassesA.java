package nested.classes.inner_class;

class InnerClassesA {

    int i = 10;

    public void print(){
        System.out.println("Outer class A i = "+i);
    }

    public class B{
        int j = 15;
        public void print(){
            System.out.println("Inner Class B j = "+j);
        }
    }


}


