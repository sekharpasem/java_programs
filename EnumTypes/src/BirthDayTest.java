public class BirthDayTest {
    public enum TeamBirthday{
        SEKHAR("04-06"),RAJU("05-7");

        private String date;

        TeamBirthday(String date){
            this.date = date;
        }
        public String getValue(){
            return date;
        }

    }

    public void print(TeamBirthday birthday){
        System.out.println(birthday.getValue());
    }


    public static void main(String[] args) {

        BirthDayTest birth = new BirthDayTest();
        birth.print(TeamBirthday.RAJU);
    }
}
