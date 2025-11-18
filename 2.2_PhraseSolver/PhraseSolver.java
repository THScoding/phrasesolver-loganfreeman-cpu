/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    board = new Board();
    solved = false;
  }
  
  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;
    Player current;
    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {

      
      /* your code here - game logic */
      
      if(currentPlayer == 1)
      {
       current = player1;
      }
      else
      {
       current = player2;
      }
      System.out.println("The current player is " + current.getName());
      System.out.println("Your current unsolved phrase is " + board.getSolvedPhrase());
      System.out.println("The next geuss will give you " + board.getCurrentLetterValue() + "points");
      
      while(solved = false)
      {
       System.out.println(current.getName() + "Please enter a a letter");
       String userLetter = input.nextLine();
       if(board.guessLetter(userLetter) == true)
       {
        System.out.println(userLetter + " Was in the phrase");
        System.out.println("Your current unsolved phrase is " + board.getSolvedPhrase());
        current.setPoints(board.setLetterValue());
       }
       else
       {
        System.out.println(userLetter + " Was not in the phrase");
       }
      }

      /* your code here - determine how game ends */
      solved = true; 
    
   
  }
  }
}  
