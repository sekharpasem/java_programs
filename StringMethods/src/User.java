public class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;

    }

    public void print(){
        System.out.println("print method calling....");
        System.out.println("name: "+this.name+" age:"+this.age+ " phone:"+this.phone);
    }
}
