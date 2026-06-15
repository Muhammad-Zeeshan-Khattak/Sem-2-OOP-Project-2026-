import java.time.*;
import java.util.*;

 class Main {

    // Welcome Message
    static String printMenu() {
        return "=============================================\n"
                + "        WELCOME TO RULE-BASED AI CHATBOT\n"
                + "=============================================\n\n"
                + "Hello! I am your virtual assistant.\n\n"
                + "I can help you with:\n"
                + "• Greetings\n"
                + "• Basic conversations\n"
                + "• Information about AI and Programming\n"
                + "• Date and Time\n"
                + "• Jokes and Fun Facts\n"
                + "• Motivation and Study Tips\n"
                + "• General Knowledge Questions\n\n"
                + "Type \"help\" to see this menu again.\n"
                + "Type \"exit\" or \"bye\" to end the conversation.\n";
    }

    // Greeting Method
    static void greeting(String str) {

        String[] greetings = {
                "hi", "hello", "hey", "heyy",
                "good morning", "good afternoon",
                "good evening", "hi there",
                "hello there"
        };

        boolean isGreeting = false;

        for (String greet : greetings) {
            if (greet.equals(str)) {
                isGreeting = true;
                break;
            }
        }

        if (isGreeting) {
            System.out.println("Bot: " + str + "! How can I assist you?");
        }
    }
    static String commands() {

    return "\n========== AVAILABLE COMMANDS ==========\n\n"

            + "🔹 Greetings:\n"
            + "hi, hello, hey, good morning, good evening\n\n"

            + "🔹 Basic Info:\n"
            + "what is your name, who are you, who created you\n"
            + "how old are you, what is your purpose\n\n"

            + "🔹 Date & Time:\n"
            + "date, time, day\n\n"

            + "🔹 Programming:\n"
            + "what is ai, what is java, what is python, what is programming\n\n"

            + "🔹 Math Operations:\n"
            + "addition, subtraction, multiplication, division\n"
            + "percentage, square, cube, square root\n\n"

            + "🔹 Number Logic:\n"
            + "palindrome, even or odd, prime, leap year\n"
            + "largest number, smallest number\n"
            + "random number, coin toss, dice\n\n"

            + "🔹 Fun & Entertainment:\n"
            + "joke, riddle, poem, story, fact\n\n"

            + "🔹 Motivation & Study:\n"
            + "motivation, study tip, exam tips, coding tips\n\n"

            + "🔹 General Knowledge:\n"
            + "capital of pakistan, india, usa, uk\n\n"

            + "🔹 Life Topics:\n"
            + "happiness, friendship, success, love, health\n\n"

            + "🔹 Utility:\n"
            + "help, commands, exit, bye\n\n"

            + "========================================";
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(printMenu());

        while (true) {

            System.out.print("\nYou: ");
            String str = sc.nextLine().toLowerCase().trim();

            if (str.isEmpty()) {
                System.out.println("Bot: Please enter something!");
            }

            else if (str.equals("help")) {
                System.out.println(printMenu());
            }

            else if (str.equals("exit") || str.equals("bye") || str.equals("quit")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            // Greetings
            else if (str.equals("hi") || str.equals("hello") || str.equals("hey")
                    || str.equals("heyy") || str.equals("good morning")
                    || str.equals("good afternoon") || str.equals("good evening")
                    || str.equals("hi there") || str.equals("hello there")) {

                greeting(str);
            }

            // Command
            else if(str.equals("commands")){
                System.out.println(Main.commands());
                    
            }

            // Name
            else if (str.equals("what is your name")
                    || str.equals("who are you")
                    || str.equals("your name")) {

                System.out.println("Bot: My name is RuleBot.");
                System.out.println("I am a Rule-Based AI Chatbot developed in Java.");
            }

            // Creator
            else if (str.equals("who created you")
                    || str.equals("who made you")
                    || str.equals("your creator")) {

                System.out.println("Bot: I was created by a Java developer");
                System.out.println("as part of an Artificial Intelligence project");
                System.out.println("using rule-based programming.");
            }

            // Age
            else if (str.equals("how old are you")
                    || str.equals("what is your age")) {

                System.out.println("Bot: I don't have a real age.");
                System.out.println("I exist as a computer program.");
                System.out.println("I can help you anytime.");
            }

            // Purpose
            else if (str.equals("what is your purpose")
                    || str.equals("why are you here")
                    || str.equals("what can you do")) {

                System.out.println("Bot: My purpose is to assist users");
                System.out.println("by answering predefined questions,");
                System.out.println("providing useful information, and");
                System.out.println("demonstrating rule-based AI using Java.");
            }

            // Date
            else if (str.equals("what is today's date")
                    || str.equals("date")
                    || str.equals("today's date")) {

                LocalDate today = LocalDate.now();
                System.out.println("Bot: Today's date is " + today);
            }

            // Time
            else if (str.equals("what time is it")
                    || str.equals("time")
                    || str.equals("current time")) {

                LocalTime time = LocalTime.now();
                System.out.println("Bot: Current time is " + time.withNano(0));
            }

            // Day
            else if (str.equals("what day is it")
                    || str.equals("day")
                    || str.equals("today")) {

                DayOfWeek day = LocalDate.now().getDayOfWeek();
                System.out.println("Bot: Today is " + day);
            }

            // AI
            else if (str.equals("what is ai")) {

                System.out.println("Bot: Artificial Intelligence (AI) is the");
                System.out.println("simulation of human intelligence by machines");
                System.out.println("that can learn, reason, and solve problems.");
            }

          
            // Machine Learning
else if (str.equals("what is machine learning") || str.equals("machine learning")) {

    System.out.println("Bot: Machine Learning (ML) is a branch of Artificial Intelligence that enables computers to learn from data and make predictions without being explicitly programmed.");
}

// Java
else if (str.equals("what is java") || str.equals("java")) {

    System.out.println("Bot: Java is a high-level, object-oriented programming language used for developing desktop, web, mobile, and enterprise applications.");
}

// Python
else if (str.equals("what is python") || str.equals("python")) {

    System.out.println("Bot: Python is a simple and powerful programming language widely used in AI, machine learning, web development, and automation.");
}

// Programming
else if (str.equals("what is programming") || str.equals("programming")) {

    System.out.println("Bot: Programming is the process of writing instructions (code) that tell a computer how to perform specific tasks.");
}

// Weather
else if (str.equals("weather") || str.equals("what is the weather")) {

    System.out.println("Bot: Sorry, I cannot access live weather information.");
}

// Location
else if (str.equals("where am i") || str.equals("my location") || str.equals("location")) {

    System.out.println("Bot: I don't have access to your current location.");
}

// Favorite Color
else if (str.equals("what is your favorite color") || str.equals("favorite color")) {

    System.out.println("Bot: I like blue because it represents knowledge and trust.");
}

// Favorite Food
else if (str.equals("what is your favorite food") || str.equals("favorite food")) {

    System.out.println("Bot: I don't eat, but if I could choose, I'd say pizza!");
}

// Favorite Movie
else if (str.equals("what is your favorite movie") || str.equals("favorite movie")) {

    System.out.println("Bot: I enjoy science fiction movies like Interstellar.");
}

// Favorite Sport
else if (str.equals("what is your favorite sport") || str.equals("favorite sport")) {

    System.out.println("Bot: I like cricket and football because they bring people together.");
}

// Who are you
else if (str.equals("who are you")) {

    System.out.println("Bot: I am RuleBot, a rule-based AI chatbot developed in Java to answer predefined questions.");
}

// Thank You
else if (str.equals("thank you") || str.equals("thanks")) {

    System.out.println("Bot: You're welcome! Happy to help.");
}

// Sorry
else if (str.equals("sorry")) {

    System.out.println("Bot: No problem! Let's continue.");
}

// Good Morning
else if (str.equals("good morning")) {

    System.out.println("Bot: Good morning! Have a wonderful day.");
}

// Good Afternoon
else if (str.equals("good afternoon")) {

    System.out.println("Bot: Good afternoon! Hope you're doing well.");
}

// Good Evening
else if (str.equals("good evening")) {

    System.out.println("Bot: Good evening! How can I help you today?");
}

// How are you
else if (str.equals("how are you")) {

    System.out.println("Bot: I'm doing great! Thanks for asking.");
}

// Can you help
else if (str.equals("can you help") || str.equals("help me")) {

    System.out.println("Bot: Yes! I'll do my best to answer your questions.");
}

// Tell a fact
else if (str.equals("tell me a fact") || str.equals("fact")) {

    System.out.println("Bot: Fun Fact: The first computer programmer was Ada Lovelace.");
}

// Capital of Pakistan
else if (str.equals("capital of pakistan") || str.equals("what is the capital of pakistan")) {

    System.out.println("Bot: The capital of Pakistan is Islamabad.");
}

// Capital of India
else if (str.equals("capital of india") || str.equals("what is the capital of india")) {

    System.out.println("Bot: The capital of India is New Delhi.");
}

// Capital of USA
else if (str.equals("capital of usa") || str.equals("what is the capital of united states")) {

    System.out.println("Bot: The capital of the USA is Washington, D.C.");
}

// Capital of UK
else if (str.equals("capital of uk") || str.equals("what is the capital of united kingdom")) {

    System.out.println("Bot: The capital of the United Kingdom is London.");
}

// Joke
 else if (str.equals("tell me a joke")
                    || str.equals("joke")) {

                System.out.println("Bot: Why do programmers prefer dark mode?");
                System.out.println("Because light attracts bugs!");
            }

            // Motivation
            else if (str.equals("motivate me")
                    || str.equals("motivation")) {

                System.out.println("Bot: Success comes from consistency.");
                System.out.println("Keep learning and never stop practicing!");
            }

            // Study Tip
            else if (str.equals("study tip")
                    || str.equals("give me a study tip")) {

                System.out.println("Bot: Study for 25-30 minutes with full focus,");
                System.out.println("then take a 5-minute break.");
            }
            

            else if(str.equals("addition")){
              System.out.print("Enter how many numbers\n"+
                                  "you want to add:");

              int numbers = sc.nextInt();
              if(numbers == 1){
                System.out.print("Enter number:");
                int n = sc.nextInt();
                System.out.println("Sum is: "+n);
              }

              else if(numbers == 2){
                System.out.print("Enter 1st number:");
                int n1 = sc.nextInt();

                System.out.print("Enter 2nd number:");
                int n2 = sc.nextInt();
                System.out.println("Sum is: "+(n1 + n2));
              }

              else if(numbers == 3){
                System.out.print("Enter 1st number:");
                int n1 = sc.nextInt();

                System.out.print("Enter 2nd number:");
                int n2 = sc.nextInt();

                System.out.print("Enter 3rd number:");
                int n3 = sc.nextInt();
                System.out.println("Sum is: "+(n1 + n2 + n3));
              }

              else {
                   System.out.println("Bot: Please enter 1, 2, or 3 numbers only.");
              }
              sc.nextLine();

            }
 // Subtraction
            else if (str.equals("subtraction")) {

    System.out.print("Enter how many numbers you want to subtract: ");
    int numbers = sc.nextInt();

    if (numbers == 1) {

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Result is: " + n);
    }

    else if (numbers == 2) {

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.println("Result is: " + (n1 - n2));
    }

    else if (numbers == 3) {

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();

        System.out.println("Result is: " + (n1 - n2 - n3));
    }

    else {

        System.out.println("Bot: Please enter 1, 2, or 3 numbers only.");
    }

    sc.nextLine();
}
 
 // Multiplication
else if (str.equals("multiplication")) {

    System.out.print("Enter how many numbers you want to multiply: ");
    int numbers = sc.nextInt();

    if (numbers == 1) {

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Result is: " + n);
    }

    else if (numbers == 2) {

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.println("Result is: " + (n1 * n2));
    }

    else if (numbers == 3) {

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();

        System.out.println("Result is: " + (n1 * n2 * n3));
    }

    else {

        System.out.println("Bot: Please enter 1, 2, or 3 numbers only.");
    }

    sc.nextLine();
}

// Division
else if (str.equals("division")) {

    System.out.print("Enter how many numbers you want to divide: ");
    int numbers = sc.nextInt();

    if (numbers == 1) {

        System.out.print("Enter number: ");
        double n = sc.nextDouble();

        System.out.println("Result is: " + n);
    }

    else if (numbers == 2) {

        System.out.print("Enter 1st number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double n2 = sc.nextDouble();

        if (n2 == 0) {
            System.out.println("Bot: Division by zero is not allowed.");
        } else {
            System.out.println("Result is: " + (n1 / n2));
        }
    }

    else if (numbers == 3) {

        System.out.print("Enter 1st number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double n2 = sc.nextDouble();

        System.out.print("Enter 3rd number: ");
        double n3 = sc.nextDouble();

        if (n2 == 0 || n3 == 0) {
            System.out.println("Bot: Division by zero is not allowed.");
        } else {
            System.out.println("Result is: " + (n1 / n2 / n3));
        }
    }

    else {

        System.out.println("Bot: Please enter 1, 2, or 3 numbers only.");
    }

    sc.nextLine();
}
// Location
else if (str.equals("location") ||
         str.equals("where am i") ||
         str.equals("what is my location")) {

    System.out.println("Bot: Sorry, I cannot access your current location.");
}

// Favorite Color
else if (str.equals("favorite color") ||
         str.equals("what is your favorite color")) {

    System.out.println("Bot: My favorite color is Blue because it represents intelligence and calmness.");
}

// Favorite Food
else if (str.equals("favorite food") ||
         str.equals("what is your favorite food")) {

    System.out.println("Bot: I don't eat food, but if I could choose, I'd pick pizza!");
}

// Favorite Movie
else if (str.equals("favorite movie") ||
         str.equals("what is your favorite movie")) {

    System.out.println("Bot: I like science fiction movies, especially Interstellar.");
}

// Favorite Sport
else if (str.equals("favorite sport") ||
         str.equals("what is your favorite sport")) {

    System.out.println("Bot: I enjoy cricket and football because they are exciting games.");
}

// Who Are You
else if (str.equals("who are you") ||
         str.equals("tell me about yourself")) {

    System.out.println("Bot: I am RuleBot, a rule-based AI chatbot developed in Java.");
    System.out.println("Bot: I can answer questions, perform calculations, and have simple conversations.");
}

// Thank You
else if (str.equals("thank you") ||
         str.equals("thanks")) {

    System.out.println("Bot: You're welcome! Happy to help.");
}

// Sorry
else if (str.equals("sorry")) {

    System.out.println("Bot: That's okay! No worries.");
}

// Good Morning
else if (str.equals("good morning")) {

    System.out.println("Bot: Good Morning! Have a wonderful day ahead.");
}

// Good Afternoon
else if (str.equals("good afternoon")) {

    System.out.println("Bot: Good Afternoon! Hope you're having a great day.");
}

// Good Evening
else if (str.equals("good evening")) {

    System.out.println("Bot: Good Evening! How can I assist you today?");
}

// How Are You
else if (str.equals("how are you") ||
         str.equals("how are you doing")) {

    System.out.println("Bot: I'm doing great! Thanks for asking.");
}

// Can You Help
else if (str.equals("can you help") ||
         str.equals("help me")) {

    System.out.println("Bot: Of course! I will do my best to assist you.");
}

// Tell Me a Fact
else if (str.equals("tell me a fact") ||
         str.equals("fact") ||
         str.equals("tell me something interesting")) {

    System.out.println("Bot: Fun Fact: The first computer programmer was Ada Lovelace.");
}

else if(str.equals("percentage")){
    System.out.print("Enter value to find %:");
    double num = sc.nextDouble();

    System.out.print("Enter value i.e out of: ");
    double n_out = sc.nextDouble();
    sc.nextLine(); // Consume the leftover newline

    double per = (num/n_out) * 100;
    System.out.println("Percentage is: "+per + "%");

}
 else if (str.equals("square") || str.equals("cube") || str.equals("square root")) {

    System.out.print("Enter a number: ");
    double num = sc.nextDouble();
    sc.nextLine(); // Consume the leftover newline

    if (str.equals("square")) {

        double result = num * num;
        System.out.println("Bot: The square of " + num + " is " + result);

    }

    else if (str.equals("cube")) {

        double result = num * num * num;
        System.out.println("Bot: The cube of " + num + " is " + result);

    }

    else if (str.equals("square root")) {

        if (num < 0) {
            System.out.println("Bot: Square root of a negative number is not possible in real numbers.");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Bot: The square root of " + num + " is " + result);
        }

    }
}
// PALINDROME
else if (str.equals("palindrome")) {
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    sc.nextLine();

    int original = n;
    int reverse = 0;

    while (n > 0) {
        int last = n % 10;
        reverse = reverse * 10 + last;
        n = n / 10;
    }

    if (original == reverse)
        System.out.println("Bot: It is a Palindrome.");
    else
        System.out.println("Bot: It is not a Palindrome.");
}

// EVEN OR ODD
else if (str.equals("even or odd")) {
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.nextLine();

    if (num % 2 == 0)
        System.out.println("Bot: " + num + " is Even.");
    else
        System.out.println("Bot: " + num + " is Odd.");
}

// LEAP YEAR
else if (str.equals("leap year")) {
    System.out.print("Enter a year: ");
    int year = sc.nextInt();
    sc.nextLine();

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        System.out.println("Bot: " + year + " is a Leap Year.");
    else
        System.out.println("Bot: " + year + " is not a Leap Year.");
}

// PRIME NUMBER
else if (str.equals("prime")) {
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.nextLine();

    boolean prime = true;

    if (num <= 1)
        prime = false;

    for (int i = 2; i < num/2; i++) {
        if (num % i == 0) {
            prime = false;
            break;
        }
    }

    if (prime)
        System.out.println("Bot: " + num + " is a Prime Number.");
    else
        System.out.println("Bot: " + num + " is not a Prime Number.");
}

// LARGEST NUMBER
else if (str.equals("largest number")) {
    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    System.out.print("Enter third number: ");
    int c = sc.nextInt();
    sc.nextLine();

    int largest = Math.max(a, Math.max(b, c));

    System.out.println("Bot: Largest number is " + largest);
}

// SMALLEST NUMBER
else if (str.equals("smallest number")) {
    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    System.out.print("Enter third number: ");
    int c = sc.nextInt();
    sc.nextLine();

    int smallest = Math.min(a, Math.min(b, c));

    System.out.println("Bot: Smallest number is " + smallest);
}

// RANDOM NUMBER
else if (str.equals("random number")) {
    int random = (int) (Math.random() * 100) + 1;
    System.out.println("Bot: Random Number: " + random);
}

// COIN TOSS
else if (str.equals("coin toss")) {
    if (Math.random() < 0.5)
        System.out.println("Bot: Heads");
    else
        System.out.println("Bot: Tails");
}

// DICE
else if (str.equals("dice")) {
    int dice = (int) (Math.random() * 6) + 1;
    System.out.println("Bot: You rolled " + dice);
}

// PASSWORD TIP
else if (str.equals("password tip")) {
    System.out.println("Bot: Use uppercase, lowercase, numbers and special characters in your password.");
}

// INTERNET
else if (str.equals("internet")) {
    System.out.println("Bot: Sorry, I cannot access the internet.");
}

// OPEN WEBSITE
else if (str.equals("open website")) {
    System.out.println("Bot: Sorry, I cannot open websites.");
}

// STORY
else if (str.equals("tell story")) {
    System.out.println("Bot: Once a student built a Java chatbot with hard work and became a successful programmer.");
}

// POEM
else if (str.equals("poem")) {
    System.out.println("Bot: Roses are red,\nViolets are blue,\nCode every day,\nSuccess follows you.");
}

// RIDDLE
else if (str.equals("riddle")) {
    System.out.println("Bot: What has keys but can't open locks? Think carefully!");
}

// RIDDLE ANSWER
else if (str.equals("answer")) {
    System.out.println("Bot: The answer is: A Piano.");
}

// TODAY'S TIP
else if (str.equals("today's tip")) {
    System.out.println("Bot: Small improvements every day lead to big success.");
}

// STUDY ADVICE
else if (str.equals("study advice")) {
    System.out.println("Bot: Study regularly, revise often, and practice problems.");
}

// EXAM TIPS
else if (str.equals("exam tips")) {
    System.out.println("Bot: Stay calm, manage your time well, and read questions carefully.");
}

// CODING TIPS
else if (str.equals("coding tips")) {
    System.out.println("Bot: Practice coding daily and learn from your mistakes.");
}

// MOTIVATION
else if (str.equals("motivation")) {
    System.out.println("Bot: Success doesn't come overnight. Keep working hard.");
}

// HAPPINESS
else if (str.equals("happiness")) {
    System.out.println("Bot: Happiness comes from gratitude and helping others.");
}

// FRIENDSHIP
else if (str.equals("friendship")) {
    System.out.println("Bot: A true friend is someone who stands by you in every situation.");
}

// SUCCESS
else if (str.equals("success")) {
    System.out.println("Bot: Success is earned through consistency and determination.");
}

// LOVE
else if (str.equals("love")) {
    System.out.println("Bot: Love is based on trust, care, and understanding.");
}

// HEALTH
else if (str.equals("health")) {
    System.out.println("Bot: Eat healthy food, drink water, exercise, and sleep well.");
}

// SLEEP
else if (str.equals("sleep")) {
    System.out.println("Bot: Adults should get around 7 to 9 hours of sleep each night.");
}

// EXERCISE
else if (str.equals("exercise")) {
    System.out.println("Bot: At least 30 minutes of daily exercise is good for your health.");
}

// CHATBOT ABILITIES
else if (str.equals("chatbot abilities")) {
    System.out.println("Bot: I can answer predefined questions, perform simple calculations, tell jokes, and provide useful information.");
}

// LIMITATIONS
else if (str.equals("limitations")) {
    System.out.println("Bot: I cannot browse the internet or answer questions outside my programmed knowledge.");
}

// DEFAULT
else {
    System.out.println("Bot: Sorry, I don't understand that.");
    System.out.println("Try asking about:");
    System.out.println("- Greetings");
    System.out.println("- AI");
    System.out.println("- Programming");
    System.out.println("- Date");
    System.out.println("- Time");
    System.out.println("- Joke");
    System.out.println("- Palindrome");
    System.out.println("- Prime Number");
    System.out.println("- Even or Odd");
    System.out.println("- Leap Year");
    System.out.println("- Random Number");
    System.out.println("- Dice");
    System.out.println("- Coin Toss");
    System.out.println("- Study Advice");
    System.out.println("- Motivation");
    System.out.println("- Help");
}
   
    }
}
 }