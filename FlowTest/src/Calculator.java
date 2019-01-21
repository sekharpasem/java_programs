public class Calculator {


    public int add(int i, int j){
        System.out.println("add method called");
        int sum = i+j;
        System.out.println("sum : "+sum);
        return sum;
    }

    public int add(int i, int j, int k){
        System.out.println("add three arguments...");
        int sum = i+j+k;
        System.out.println("add res:"+sum);
        return sum;

    }

    public int div(int i, int j){
        System.out.println("div method called");
        int div = i/j;
        System.out.println("method div res: "+div);
        return div;
    }
}
