
package chapter1_challenge1_3;
  import java.util.Random;
import java.util.Scanner;

public class Chapter1_Challenge_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int health = 100;

        System.out.println("Welcome to the Dungeon Game!");
        System.out.println("Your starting health is " + health + ".\n");

        for (int room = 1; room <= 5; room++) {
            System.out.println("Entering room " + room + "...");
            int event = rand.nextInt(3) + 1; // Random number between 1 and 3

            switch (event) {
                case 1:
                    // Trap
                    health -= 20;
                    System.out.println("A trap sprung! Health is now " + health + ".");
                    break;

                case 2:
                    // Healing potion
                    int oldHealth = health;
                    health += 15;
                    if (health > 100) {
                        health = 100;
                        System.out.println("You found a healing potion! Health is now " + oldHealth + " -> capped to 100.");
                    } else {
                        System.out.println("You found a healing potion! Health is now " + health + ".");
                    }
                    break;

                case 3:
                    // Monster
                    int monsterNumber = rand.nextInt(5) + 1; // Random number between 1 and 5
                    int guess;
                    do {
                        System.out.print("A monster appears! Guess a number (1-5) to defeat it: ");
                        guess = scanner.nextInt();
                        if (guess != monsterNumber) {
                            System.out.println("Wrong! Try again.");
                        }
                    } while (guess != monsterNumber);
                    System.out.println("You defeated the monster!");
                    break;

                default:
                    System.out.println("Unknown event.");
            }

            // Check if the player is dead
            if (health <= 0) {
                System.out.println("You have been defeated in room " + room + ".");
                break;
            }

            System.out.println(); // Line break between rooms
        }

        // Check if player survived all rooms
        if (health > 0) {
            System.out.println("You cleared the dungeon! Victorious with " + health + " health!");
        }

        scanner.close();
    }
}
