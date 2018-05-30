//package craps; for unix

/*=============================================================================  
|       Source code:  Die.java
|            Author:  Javier Deunas
|        Student ID:  5668910
|        Assignment:  Program #3 - Die class
|  
|            Course:  COP 3337 (Intermediate Programming) 
|           Section:  U06 
|        Instructor:  William Feild  
|          Due Date:  2/16/2017
|
|	I hereby certify that this collective work is my own
|	and none of it is the work of any other person or entity.
|	______________________________________ [Signature]
|  
|  +----------------------------------------------------------------------------- 
|          Purpose:  Create Die objects with any number of sides and return
| a roll of that dice
|
|    Inherits From:  None
|
|       Interfaces:  None
|
|  +-----------------------------------------------------------------------
|
|        Constants:  none
|		
| +-----------------------------------------------------------------------
|
|     Constructors:  Die(int sides)
|
|    Class Methods:  playGame()
|		
| Instance Methods:  
|		
|  *===========================================================================*
|  
|       Description:  A class to roll dice 
|                  
|             Input:  sides
|  
|            Output:  pseudorandom number between 1 and sides
|  
|           Process:   
|  
|   Required Features Not Included:  none
|  
|        Known Bugs: 
|  
|  *===========================================================================*/
import java.util.Random;
public class Die 
{
    //private instance vars
    private int sides = 0;
    private Random rand;
    /*---------------------------- Die ----------------------------
        |  Method Die(sides) - Constructor
        |
        |  Purpose:  Constructs a die with a given numebr of sides
        |
        |  @param  sides - the number of sides the dice has
        |
        |  @return  None
        *-------------------------------------------------------------------*/
    public Die(int sides)
    {
      rand = new Random();
      this.sides = sides;
    }
    /*---------------------------- RollDice() ----------------------------
        |  Method rollDice()
        |
        |  Purpose: rolls the dice and returns a pseudo random number
        |  between the given sides (inclusive).
        |
        |  @param  None
        |
        |  @return  roll - the number the die rolled
        *-------------------------------------------------------------------*/
    public int rollDice()
    {
      int roll = rand.nextInt(sides) + 1;
      return roll;
    }
}



