import java.util.Scanner;
public class DragonCaveTryCatch {
    public static void main(String[] args){
        int input; //Variable to hold integer input
        Scanner getInput = new Scanner(System.in);//Creates Scanner for user input
            System.out.println("You are in a land full of dragons. In front of you, you see two caves. \n In one cave the dragon is friendly and will share his treasure with you. \n The other dragon is greedy and hungry and will eat you on sight.");
            //Above is prompt for user
            System.out.println("\n which do you choose? (1 or 2)");
             //Creates Scanner for user input
        try {
            input = getInput.nextInt();//input is the integer that is typed in
            if (input == 1) {//if case for when user picks 1
                System.out.print("You approach the cave...\n It is dark and spooky...\n A large dragon jumps out in front of you! He opens his jaws and...\n Gobbles you down in one bite!");
                //Above is the prompt if user picks 1
            }

            if (input == 2) { //if case for when user picks 2
                System.out.print("You approach the cave...\n It is dark and spooky...\n A large dragon jumps out in front of you! Startled, you scream loudly \n He laughs and welcomes you into his cave...\n He gives you 1 gold coin for scaring you");
                //Above is the prompt if user picks 2
            }

            while (input != 1 && input != 2) { //While case that handles if user types any other number. Iterates until user picks 1 or 2
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
        }catch (Exception notAnInt){
            System.out.println("Caught Exception Not an number");
        }
    }
}