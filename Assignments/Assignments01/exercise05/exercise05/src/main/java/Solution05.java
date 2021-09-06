import java.util.Scanner;

class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates a scanner
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();  // Reads user input

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();  // Reads user input

        input.close();

        int sum = (number1 + number2);
        int difference = (number1 - number2);
        int product = (number1 * number2);
        int quotient = (number1 / number2);

        //Prints the sum, difference, product and quotient
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " / " + number2 + " = " + quotient);
    }
}