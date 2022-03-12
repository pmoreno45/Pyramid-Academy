import java.util.Scanner;
/*
    Created by: Pedro Moreno
    Objective: Demonstrate a fundamental understanding of Loops, Variables, Strings, user input, and java packages by creating a user input driven game that:
               1: Prompts user. Asks for their input
               2. Compares user input to specific scenarios
               4. Checks if user enters correct input. If not prompt them to put in the correct input
    How it works: Gets the users input (Either 1 or 2). Then compares the input to predetermined outcomes for 1 or 2. 1 being they user is eaten. 2 the dragon shares some gold.
                   I added a while to test whether or not the user entered the correct input.
*/
public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. \n In one cave the dragon is friendly and will share his treasure with you. \n The other dragon is greedy and hungry and will eat you on sight." );
        //Above is prompt for user
        System.out.println("\n which do you choose? (1 or 2)");
        Scanner getInput = new Scanner(System.in); //Creates Scanner for user input
        int input = getInput.nextInt();//input is the integer that is typed in

        if (input == 1) {//if case for when user picks 1
            System.out.print("You approach the cave...\n It is dark and spooky...\n A large dragon jumps out in front of you! He opens his jaws and...\n Gobbles you down in one bite!");
            //Above is the prompt if user picks 1
        }

        if (input == 2) { //if case for when user picks 2
            System.out.print("You approach the cave...\n It is dark and spooky...\n A large dragon jumps out in front of you! Startled, you scream loudly \n He laughs and welcomes you into his cave...\n He gives you 1 gold coin for scaring you");
            //Above is the prompt if user picks 2
        }

        while(input != 1 && input != 2){ //While case that handles if user types any other number. Iterates until user picks 1 or 2
            System.out.println("\n Incorrect choice. Which do you choose? (1 or 2)"); //Asks the question
            input = getInput.nextInt(); //asks for input
            if (input == 1) {//if case for when user picks 1
                System.out.print("You approach the cave...\n It is dark and spooky...\n A large dragon jumps out in front of you! He opens his jaws and...\n Gobbles you down in one bite!");
                //Above is the prompt if user picks 1
                break; //ends loop if user picks 1
            }

            if (input == 2) { //if case for when user picks 2
                System.out.print("You approach the cave...\n It is dark and spooky...\n A large dragon jumps out in front of you! Startled, you scream loudly \n He laughs and welcomes you into his cave...\n He gives you 1 gold coin for scaring you");
                //Above is the prompt if user picks 2
                break; //ends loop if user picks 2
            }
        }
    }
}



