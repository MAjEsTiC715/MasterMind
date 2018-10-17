# MasterMind
// Smart player has yet to be implemented, still in algorithm phase
Rules:   

The code maker generates a secret code as defined by the parameters of the run 

The code breaker guesses to try to determine the secret code.  After each guess, the code breaker gets a response from the code maker about the correctness of their guess: 

For each color guessed correctly, the code maker returns a white peg 

For each color guessed correctly and in the correct spot, the code maker returns a black peg 

The code breaker continues to guess until the correct code is guessed or until he/she runs out of guesses. 

 

 

Dynamic parameters for the game that must be input from the command line in the order provided: 

-Code length (min of 2, max of 10) 

-Number of colors (colors are represented as either integers or chars) 

-Allow duplicates? (either 1 or 0) 

-Max number of guesses allowed (min of 1, max 50) 

-Player type 

Human 

Random Guesser 

Smart 

 

The design requirements are: 

-You must have a game launcher class named GameLauncher that creates an instance of your MasterMind game and runs it 

-You must have a code class that defines the parameters of the code 

-This class MUST use encapsulation 

-Must be able to set the code to a random value 

-Must be able to set the code to a given value 

-Must have a comparison operator 

-You must have test class for your code class that tests all functions of the code class for their boundary conditions 

-You must have a code history class that is constructed with an ArrayList 

-You must retain the responses associated with each guess 

-You must have a player object, i.e., Code Breaker, that makes the guesses for the game 

 

-Optional classes: 

-CodeMaker that is responsible for the secret code 

-Display class that displays the guess and response history 

 

-Required output: 

-As player makes a guess the response should be printed out in return 

-When the secret code is guessed, a printout of the secret code should be included in the "You Win!  The secret code was  XXXX" response. 

-When a player runs out of turns without guessing the code, the game should print out   "Game Over.  The secret code was  XXXX" 
