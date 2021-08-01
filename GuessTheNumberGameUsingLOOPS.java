package OOPS;
import java.util.Random;
import java.util.Scanner;

class Game
{
    int ComputerNumber;
    int userInput;
    int noOfGuesses = 0;

    Game()
    {
        Random rand = new Random();
        this.ComputerNumber = rand.nextInt(100);
    }
    
    public void takeUserInput()
    {
        System.out.print("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
   
    boolean isCorrectNumber()
    {
    	noOfGuesses++;
        if (userInput == ComputerNumber)
        {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", ComputerNumber, noOfGuesses);
            return true;
        }
        else if(userInput < ComputerNumber)
        {
            System.out.println("Too low...");
        }
        else if(userInput > ComputerNumber)
        {
            System.out.println("Too high...");
        }
        return false;  
    }
}

public class GuessTheNumberGameUsingLOOPS 
{
    public static void main(String[] args) 
    {
        Game g = new Game();
        boolean b = false;
        while(!b)
        {
        	g.takeUserInput();
        	b = g.isCorrectNumber();
        }
    }
}
