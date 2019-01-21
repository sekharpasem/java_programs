

public class Calculator {

    public int add(int i, int j){
        return i+j;

    }

    public String add(String i, String j){
        return i+j;
    }
    public float add(float i, float j){
        return i+j;
    }

    public double add(double i, double j){
        return i+j;
    }
    public String add(String i, int j){
        return i+j;
    }
    public String add(String i, float j){
        return i+j;
    }


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int intOut = cal.add(1,3);
        System.out.println(intOut);

        String out = cal.add("1","3");
        System.out.println(out);

        String intStrOut = cal.add("1",44);
        System.out.println(intStrOut);
        String floatStrOut = cal.add("1",44f);
        System.out.println(floatStrOut);
    }
}


