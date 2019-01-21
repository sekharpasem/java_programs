public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "     HELLO    ";
        System.out.println(str);

        String str_upper = str.toUpperCase();
        System.out.println("toUpperCase : "+ str_upper);

        String to_lower = str.toLowerCase();
        System.out.println("toLowerCase : "+to_lower);

        String replace = str.replace("e","I");
        System.out.println("Replace : "+replace);

        String concat_str = str.concat("Hello");
        System.out.println("concat : "+concat_str);

        char char_at = str.charAt(0);
        System.out.println("charAt : "+char_at);

        boolean constains = str.contains("H");
        System.out.println("contains : "+constains);

        boolean endsWith = str.endsWith("demo1233");
        System.out.println("endsWith : "+endsWith);

        int indexOf = str.indexOf('T');
        System.out.println("indexOf: "+indexOf);

        int length = str.length();
        System.out.println("length : "+length);
        int lastIndexOf = str.lastIndexOf('X');
        System.out.println("lastIndexOf: "+lastIndexOf);
        int lastIndexOfStr = str.lastIndexOf("demo");
        System.out.println("lastIndexOfStr: "+lastIndexOfStr);
        int lastIndexOfFromIndex = str.lastIndexOf('e',38);

        System.out.println("lastIndexOfFromIndex : "+lastIndexOfFromIndex);
        int lastIndexOfStringFromIndex = str.lastIndexOf("demo", 38);
        System.out.println("lastIndexOfStringFromIndex : "+lastIndexOfStringFromIndex);

        int compareTo = str.compareTo("HellorrZZZ");
        System.out.println("compareTo: "+compareTo);

        int compareToIgnoreCase= str.compareToIgnoreCase("HELLoo");
        System.out.println("compareToIgnoreCase : "+compareToIgnoreCase);


        boolean equals = str.equals("hello WORLD");
        System.out.println("equals: "+equals);

        boolean equalsIgnore = str.equalsIgnoreCase("HELLO");
        System.out.println("equalsIgnore: "+equalsIgnore);

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = str1;

        String str4 = new String("Hello");
        String str5 = new String("Hello");
        String str6 = str5;
        str3 = new String("Hello");
        str3.replace("H","I");

        System.out.println(str6==str5);


        System.out.println("str with sapces:"+str);
        str = str.trim();
        System.out.println("str without sapces:"+str);
    }
}
