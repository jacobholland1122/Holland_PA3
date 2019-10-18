import java.security.SecureRandom;
import java.util.Scanner;

public class Holland__P1 {

    public static int question(int difficultyChoice) {

        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int number1;
        int number2;
        int ans;
        int questionCount = 10;

        if(difficultyChoice == 1) {
            number1 = random.nextInt(9);
            number2 = random.nextInt(9);
            System.out.println("What is " + number1 + "*" + number2 + "?");
            ans = scnr.nextInt();

            if(ans == (number1 * number2)) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(difficultyChoice == 2) {
            number1 = random.nextInt(99) + 10;
            number2 = random.nextInt(99) + 10;
            System.out.println("What is " + number1 + "*" + number2 + "?");
            ans = scnr.nextInt();
            if(ans == (number1 * number2)) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(difficultyChoice == 3) {
            number1 = random.nextInt(1000) + 100;
            number2 = random.nextInt(1000) + 100;
            System.out.println("What is " + number1 + "*" + number2 + "?");
            ans = scnr.nextInt();
            if(ans == (number1 * number2)) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(difficultyChoice == 4) {
            number1 = random.nextInt(10000) + 1000;
            number2 = random.nextInt(10000) + 1000;
            System.out.println("What is " + number1 + "*" + number2 + "?");
            ans = scnr.nextInt();
            if(ans == (number1 * number2)) {
                return 1;
            }
            else
                return 0;
        }
        return questionCount;
    }
    public static void arithmetic(int difficultyChoice, int arithmeticChoice) {


    }

    public static void answerCorrect() {

        SecureRandom random = new SecureRandom();

        int commentPoss;

        commentPoss = random.nextInt(4);

        switch (commentPoss) {

            case 0:
                System.out.println("Very good!");
                break;

            case 1:
                System.out.println("Excellent!");
                break;

            case 2:
                System.out.println("Nick work!");
                break;

            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public static void answerIncorrect () {

        SecureRandom random = new SecureRandom();

        int commentRandom;

        commentRandom = random.nextInt(4);

        switch (commentRandom) {

            case 0:
                System.out.println("No. Please try again.");
                break;

            case 1:
                System.out.println("Wrong. Try once more.");
                break;

            case 2:
                System.out.println("Don't give up!");
                break;

            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int studentAnswer;
        int questionCount;
        int rightAnswer;
        int wrongAnswer;
        float percentageRight;
        char key = 'y';
        int difficultyChoice;
        int arithmeticChoice;

        questionCount = 0;
        rightAnswer = 0;
        wrongAnswer = 0;

        System.out.println("Please enter a difficulty level. 1 being single-digit, 2 being double-digit, 3 being triple-digit, 4 being quadruple digit");
        difficultyChoice = scnr.nextInt();
        System.out.println("What type of arithmetic problem would you like to select? 1 = multiplication, 2 = addition, 3 = subtraction, 4 = division, 5 = random mixture");
        arithmeticChoice = scnr.nextInt();
        while(key == 'y') {

            questionCount = questionCount + 1;
            studentAnswer = question(difficultyChoice);

            if (studentAnswer == 1) {
                rightAnswer = rightAnswer + 1;
                answerCorrect();
            } else {
                wrongAnswer = wrongAnswer + 1;
                answerIncorrect();
            }
            if (questionCount == 10) {
                percentageRight = rightAnswer;
                if (percentageRight > 7) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                    key = 'n';
                } else {
                    System.out.println("Please ask your teacher for extra help.");
                    key = 'n';
                }
                System.out.println("Would you like to continue?");
                key = scnr.next().charAt(0);
            }
        }
        scnr.close();
    }
}
