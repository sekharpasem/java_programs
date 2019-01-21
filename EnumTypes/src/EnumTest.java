public class EnumTest {

    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATDAY, SUNDAY
    }


    public void printDay(Day day){

        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad..");
                break;
            case FRIDAY:
                System.out.println("Friday are fundays..");
                break;
            case SUNDAY:
                System.out.println("Sundays are birayni day...");

                break;

            default:
                System.out.println("work days.....");

        }
    }
    public void printAllDays(){
        Day[] values = Day.values();
        for (Day day: values) {
            System.out.println(day);

        }
    }

    public static void main(String[] args) {
        EnumTest test= new EnumTest();
        test.printAllDays();
    }

}
