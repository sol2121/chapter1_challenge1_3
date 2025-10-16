# Challenge 1.3: The Dungeon Game (Decision & Repetition)
Description

This is a simple text-based dungeon game where the player moves through 5 rooms. Each room has a random event that affects the player's health: either a trap that hurts, a healing potion that restores health (but never above 100), or a monster that the player must defeat by guessing a number correctly. The game tests decision-making, loops, and conditionals while tracking health. The goal is to survive all 5 rooms and emerge victorious.

## Example Input/Output
Entering room 1...
You found a healing potion! Health is now 115 -> capped to 100.
Entering room 2...
A monster appears! Guess a number (1-5) to defeat it: 3
Wrong! Try again: 2
Wrong! Try again: 4
You defeated the monster!
Entering room 3...
A trap sprung! Health is now 80.
Entering room 4...
A monster appears! Guess a number (1-5) to defeat it: 1
You defeated the monster!
Entering room 5...
You found a healing potion! Health is now 95.
You cleared the dungeon! Victorious with 95 health!

## Reflection

This challenge helped me practice using loops (for and do-while), conditionals, and switch statements together in one program. Managing the player's health and making sure it doesn’t go above the maximum required careful logic. The monster guessing mechanic was tricky at first since it required repeatedly asking for input until the correct guess, but using a do-while loop solved that neatly. Overall, this challenge strengthened my understanding of controlling program flow and working with random numbers and user input in Java.                                                                                     
