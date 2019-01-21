public class HellloString {
    public static void main(String[] args){
        String s = "Hello";
        System.out.println("s:"+s);
        String s1= "Hello";
        System.out.println("s1:"+s1);
        System.out.println(s1.hashCode());
        System.out.println(s.hashCode());



        String s3 = new String("Hello");
        System.out.println("s3: "+s3);
        System.out.println(s3.hashCode());

        String s4 = new String("Hello");
        System.out.println("s4:"+s4);
        System.out.println(s4.hashCode());
        System.out.println("\"sekhar\"");

        if(s1==s3){
            System.out.println("Both are same");
        }else{
            System.out.println("They are not same");
        }

    }
}
