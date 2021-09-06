import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates a scanner
        System.out.println("What is the quote? ");
        String yourquote = input.nextLine();  // Reads user input

        System.out.println("Who said it? ");
        String whosaid = input.nextLine();  // Reads user input

        //  Scanner closer
        input.close();

        System.out.println(whosaid + " says, \"" + yourquote + ".\"");  // Print line with inputs
    }
}