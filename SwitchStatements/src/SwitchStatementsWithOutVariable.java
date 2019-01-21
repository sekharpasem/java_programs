public class SwitchStatementsWithOutVariable {

    public static void main(String[] args) {

        String out = null;
        short number = 5;
        switch (number){
            case 5:
                out = "Jan";
                break;
            case 2:
                out = "Feb";
                break;
            case 3:
                out = "Mar";
                break;
            case 4:
                out = "April";
                break;

        }

        System.out.println(out);
        System.out.println("Program terminated...");
    }
}
