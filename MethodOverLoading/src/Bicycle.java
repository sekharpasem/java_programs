public class Bicycle {
    private int gears;
    private String name;
    private int speed;
    public static int numberOfBicycle = 0;
    public static int totalWheels = 0;
    public static final float PI=3.1414f;

    Bicycle(int gears, String name, int speed){
        this.name = name;
        this.gears = gears;
        this.speed =speed;
        System.out.println("Bicycle three paramter constructor");
        numberOfBicycle++;
        totalWheels = totalWheels+2;
    }

    public void start(){
        System.out.println("Bike started with "+this.name+" "+this.gears+" "+this.speed);
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
    public int getGears(){
        return gears;
    }
    public void setName(String name){
        this.name = name;

    }

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return this.name;
    }


    public Bicycle whoIsFast(Bicycle b1, Bicycle b2){
        int b1_speed = b1.getSpeed();
        int b2_speed = b2.getSpeed();

        if(b1_speed>b2_speed){
            return b1;

        }
        else {
            return b2;
        }

    }

    public Bicycle whoIsFast(Bicycle b1, Bicycle b2, Bicycle b3){

        if(b1.getSpeed()>b3.getSpeed() && b1.getSpeed()>b2.getSpeed()){
            return b1;
        }else if(b2.getSpeed()>b3.getSpeed() && b2.getSpeed() > b1.getSpeed()){
            return b2;
        }
        else{
            return b3;
        }

    }

}
