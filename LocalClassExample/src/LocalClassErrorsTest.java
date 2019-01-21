public class LocalClassErrorsTest {
    public void greetInEnglish() {
        interface HelloThere {
            public void greet(String name);
        }
        class EnglishHelloThere implements HelloThere {
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        }
        HelloThere myGreeting = new EnglishHelloThere();
        myGreeting.greet("Hello,");
    }


    public void sayGoodbyeInEnglish1() {
        class EnglishGoodbye {
            public static void sayGoodbye() {
                System.out.println("Bye bye");
            }
        }
        EnglishGoodbye.sayGoodbye();
    }

    public void sayGoodbyeInEnglish2() {
        class EnglishGoodbye {
            public static final String farewell = "Bye bye";
            public void sayGoodbye() {
                System.out.println(farewell);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }
}
