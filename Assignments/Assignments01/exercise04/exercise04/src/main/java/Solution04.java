import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Chang
 */

class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates a scanner
        System.out.println("Enter a noun: ");
        String noun = input.nextLine();  // Reads user input

        System.out.println("Enter a verb: ");
        String verb = input.nextLine();  // Reads user input

        System.out.println("Enter a adjective: ");
        String adjective = input.nextLine();  // Reads user input

        System.out.println("Enter a adverb: ");
        String adverb = input.nextLine();  // Reads user input

        input.close();

        System.out.println(noun + " likes to " + verb + " " + adverb + " to his favorite " + adjective + " pond yearly.");  // Print line with inputs (Mad Lib)
    }
}