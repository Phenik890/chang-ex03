import java.util.Scanner;

class Solution02 {
    public static void main(String[] args) {
        Scanner stringinput = new Scanner(System.in);  // Creates a scanner
        System.out.println("What is the input string? ");
        String yourinput = stringinput.nextLine();  // Reads user input

        stringinput.close(); //  Closes scanner

        System.out.println(yourinput + " has " + yourinput.length() + " characters.");  //Counts and prints user input and length
    }
}