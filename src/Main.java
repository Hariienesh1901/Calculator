import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to terminal Calculator");

        Scanner myIn = new Scanner(System.in);

        System.out.println("Enter an number");
        double firstNum = myIn.nextDouble();

        myIn.nextLine();

        System.out.println("Enter an operator");
        String operator = myIn.nextLine();

        System.out.println("Enter an number");
        double secondNum = myIn.nextDouble();

        myIn.nextLine();

        if (operator.equals("+")) {
            double added = firstNum + secondNum;
            System.out.println(added);
        }
        if (operator.equals("-")) {
            double subtracted = firstNum - secondNum;
            System.out.println(subtracted);
        }
        if (operator.equals("*")) {
            double multiplied = firstNum * secondNum;
            System.out.println(multiplied);
        }
        if (operator.equals("/")) {
            double divided = firstNum / secondNum;
            System.out.println(divided);
        }
    }
}