public class Bicycle {
    int gears;
    String name;
    int speed;

    Bicycle(int gears, String name){
        this.name = name;
        this.gears = gears;
        System.out.println("Bicycle two paramter constructor");
    }
    Bicycle(int gears, String name, int speed){
        this.name = name;
        this.gears = gears;
        this.speed =speed;
        System.out.println("Bicycle three paramter constructor");
    }

    public void start(){
        System.out.println("Bike started with "+this.name+" "+this.gears+" "+this.speed);
    }
}
