public class Constructors {


    public static void main(String[] args) {
        Bicycle yamha = new Bicycle(2, "Yamaha",30);
        yamha.start();
        Bicycle hero = new Bicycle(2, "Hero",40);
        hero.start();
        Bicycle avenger = new Bicycle(2, "avneger",40);

        Bicycle avenger1 = new Bicycle(2, "avneger",40);

        Bicycle avenger3 = new Bicycle(2, "avneger",40);

        Bicycle avenger2 = new Bicycle(2, "avneger",40);

        System.out.println("Number of bicyles: "+Bicycle.numberOfBicycle);
        System.out.println("tatal of wheels: "+Bicycle.totalWheels);

    }
}
