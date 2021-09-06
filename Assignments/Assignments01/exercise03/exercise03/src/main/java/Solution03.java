import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates a scanner
        System.out.println("What is the quote? ");
        String yourquote = input.nextLine();  // Reads user input

        System.out.println("Who said it? ");
        String whosaid = input.nextLine();  // Reads user input

        input.close();

        System.out.println(whosaid + " says, \"" + yourquote + ".\"");  // Print line with inputs
    }
}