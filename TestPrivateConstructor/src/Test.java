public class Test {
    public static void main(String[] args) {
        User s0 = User.getNewUser(27, "Sekhar");
        User s1 = User.getNewUser(34, "Raju");
        User s2 = User.getNewUser(45, "Jaffa");

        User.print(s0);
        User.print(s1);
        User.print(s2);


    }
}
