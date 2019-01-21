public class StringMethodsDemo1 {
    public static void main(String[] args) {
        String user_data = args[0];
        user_data = "Hiiii";
        System.out.println(user_data.substring(1,1));
        String[] userArr = user_data.split(",");
        String phone_Number = userArr[2];
        if(phone_Number.length()!=10){
            System.out.println("Enter valid mobile number!");
            return;

        }
        String phone = user_data.substring(user_data.length()-10);
        System.out.println("Your mobile number is :"+phone);

        String age = user_data.substring(user_data.length()-13, (user_data.length()-13)+2);
        System.out.println("Your age is :"+age);

        String name = user_data.substring(0, user_data.length()-14);
        System.out.println("Your name is : "+name);


    }
}
