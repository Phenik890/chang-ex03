import java.util.Scanner;

class Solution01 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);  // Creates a scanner
        System.out.println("What is your name? ");
        String yourname = name.nextLine();  // Reads user input

        name.close();

        System.out.println("Hello, " + yourname + ", nice to meet you!");  // Print line with input
    }
}