public class Constructors {


    public static void main(String[] args) {
        Bicycle b = new Bicycle(4,"Hero", 20);
        System.out.println(b.gears);
        System.out.println(b.name);
        System.out.println(b.speed);

        b.start();
    }
}
