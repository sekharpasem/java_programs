public class User {

    public int age;
    private String name;

    private User(int age, String name){
        this.age = age;
        this.name = name;
    }
    private User(int age){
        this.age = age;

    }

    public static void print(User user){

        System.out.println("name : "+user.name + " Age: "+user.age);
    }

    public static User getNewUser(int age){

        return new User(age);
    }
    public static User getNewUser(int age, String name){

        return new User(age, name);
    }


}
