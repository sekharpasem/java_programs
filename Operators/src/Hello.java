public class Hello {
    public static void main(String[] args) {


        int testscore = 50;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
            System.out.println("Grade = " + grade);
        }
        if (testscore >= 80) {
            grade = 'B';
            System.out.println("Grade = " + grade);
        }
        if (testscore >= 70) {
            grade = 'C';
            System.out.println("Grade = " + grade);
        }
        if (testscore >= 60) {
            grade = 'D';
            System.out.println("Grade = " + grade);
        } else {
            grade = 'F';
            System.out.println("Grade = " + grade);
        }

        String s = "PASEMSEKHAR12";
        String s1 = "pasemsekhar12";

        s = s.toLowerCase();
        s1 = s1.toLowerCase();

        if(s.equals(s1)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

    }
}




