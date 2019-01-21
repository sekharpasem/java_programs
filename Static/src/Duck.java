public class Duck {
    int height;
    String name;
    private static int numberOfDucks;

    {
        System.out.println("Non static block 1....");
    }
    {
        System.out.println("Non static block 2....");
    }

    static {
        print(1);
    }
    static {
        print(2);
    }
    static {
        print(3);
    }
    private static void print(int i){
        System.out.println("Static block ..."+i);
        System.out.println("Static block numberOfDucks : "+getNumberOfDucks());
    }


    Duck(String name, int height){
        System.out.println("Duck constructor...");
        this.name = name;
        this.height = height;
        numberOfDucks++;
    }

    {
        System.out.println("Non static block 3....");
    }

    public static int getNumberOfDucks(){
        return numberOfDucks;
    }

    static {
        System.out.println("Static block 4...");
        System.out.println("Static block 4 numberOfDucks : "+getNumberOfDucks());
    }
    public void run(){
        System.out.println("I'm duck "+this.name+" Running...(:");
    }
    public static void run(Duck d) {
        d.run();
    }


}
