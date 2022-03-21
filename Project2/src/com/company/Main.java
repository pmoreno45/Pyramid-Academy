package com.company;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/*
    Created by: Pedro Moreno
    Objective: Demonstrate a fundamental understanding of Loops, Variables, Strings, user input, and java packages by creating a guessing game that:
               1: Randomly generates a number from 1 to 20.
               2. Prompts user for their guess. The user will ONLY get 6 attempts
               3. Tell them if their guess is either too high or too low along with how many attempts they have left
               4. If they guess correctly or run out of attempts ask if they want to play again.

    How it works: I used two loops. One loop that at start is set to true and is passed. (I called it the control loop).
                  The second loop is nested inside the control loop where it repeatedly asks for user input, compares that input with random number.
                  If it is too high/ too low keep guessing until correct or out of attempts.
                  Once out of attempts breaks out of inner loop and asks if they want to play again.If yes, reset attempt counter, trial limit, and generate new number. If no both loops are not passed.
                  If correctly guessed. Ask if they want to play again. If yes, reset attempt counter, trial limit, and generate new number. If no both loops are not passed.

*/



public class Main {
    public static void main(String[] args) {
        Random number = new Random(); //Creates random "number" object
        int min = 1; //Min value for the random number generator
        int max = 20; //Max value for the random number generator
        int computerNum; //Variable for the computer generated random number
        int numOfTrials ; //variable for the number of attempts
        int guess = -1; //Guess is set to -1 so that way we always enter the loop
        int attempts =0; //Variable for counting the attempts. Set to 0 so we can increment later
        boolean playing = true; //Boolean for the loop running
        String willPlay = ""; //Place-holder  variable for willPlay prompt

        System.out.println("Hello! What is your name \n"); //Prompt for the user
        Scanner getInput = new Scanner(System.in); //scanner object for input
        String userName = getInput.nextLine(); //Scanner for user name
        Scanner getAns = new Scanner(System.in); //Scanner object for whether the player will play again

        System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20 \n"); //prompt for user

        while (playing == true) { //while playing is true. Generate number, reset trials, and reset attempts to 0
            computerNum = number.nextInt((max - min + 1) + min); //Generates new number every time the outer loop is passed
            numOfTrials = 6; //instantiates number of trials everytime the loop is passed
            attempts = 0;//instantiates attempts  everytime the loop is passed
            while (guess != computerNum && numOfTrials != 0) { //While guess is not equal to computer number AND numOfTrials is not 0
                System.out.println("Take a guess. You get 6 attempts."); //prompt for user
                guess = getInput.nextInt(); //input for user guess
                numOfTrials--; //decrements how many attempts are left
                attempts++; //counts number of attempts

                if (guess == computerNum) { //if user is correct prompt them with number of attempts and if they want to play again
                    System.out.println("You are correct! You did it in: " + attempts + " attempts"); //prompt for user
                    System.out.println("Would you like to play again?(Y/N)");//prompt for player to play again
                    //willPlay = getAns.nextLine(); //reads input from player
                } else if (guess < computerNum) { //if player guess is too low prompt them with number of attempts left
                    System.out.println("Too low. You have " + numOfTrials + " attempts left"); //prompt for user
                } else if (guess > computerNum) {//if player guess is too high prompt them with number of attempts left
                    System.out.println("Too high You have " + numOfTrials + " attempts left"); //prompt for user
                }
                if (numOfTrials == 0 && guess != computerNum) { //if the player runs out of trials prompt the correct number and if they want to play again
                    System.out.println("Out of attempts. The correct number was: " + computerNum); //prompt for user
                    System.out.println("Would you like to play again?(Y/N)");//prompt for user
                }
            }

            willPlay = getAns.nextLine();//reads input from user
            if (willPlay.equalsIgnoreCase("N")) {//if player answers no set playing to false and break outer loop
                playing = false;
            }

        }
    }
}
