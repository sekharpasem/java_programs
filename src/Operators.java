public class Operators {
    public static void main(String[] args) {
        int result = 1+2 ;
        System.out.println("1 + 2 = "+result);

        int previousResult = result;
        result = result-1;
        System.out.println(previousResult+" - 1 = "+result);

        previousResult = result;
        result = result*10;
        System.out.println(previousResult+" * 10 = "+result);

        previousResult = result;
        result = result/5;
        System.out.println(previousResult+" / 5 = "+result);

        previousResult = result;
        result = result%3;
        System.out.println(previousResult+" % 3 = "+result);

        previousResult = result;
        result = result+1;
        System.out.println("Result is now "+result);

        result++;
        System.out.println("Result is now "+result);

        result--;
        System.out.println("Result is now "+result);

        result+=2; // result = result+2;
        System.out.println("Result is now "+result);

        result*=10; // result = result*2;
        System.out.println("Result is now "+result);

        result-=10;
        System.out.println("Result is now "+result);

        result/=10;
        System.out.println("Result is now "+result);


        boolean isAlien = false;


        if(isAlien == false){
            System.out.println("It is not alien.");
        }

        int topScore = 100;
        if (topScore != 100){
            System.out.println("You got the high score.");
        }
        if (topScore > 100){
            System.out.println("You got the high score.");
        }
        if (topScore >= 100){
            System.out.println("You got the high score.");
        }
        if (topScore < 100){
            System.out.println("You got the high score.");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore<=90)){
            System.out.println("One of these tests are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }
    }
}
