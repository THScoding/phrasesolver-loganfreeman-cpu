/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{ 
  /* your code here - attributes */
 private String username;
 private int points;
  /* your code here - constructor(s) */ 
public Player()
  {
 System.out.println("Please enter your username:");
 Scanner sc = new Scanner(System.in);
 username = sc.next();
 sc.close();
 points = 0;
 System.out.println("Welcome to Hangman " + username);
 } 

public Player(String inputName)
{
 username = inputName; 
 System.out.println("Welcome to Hangman " + inputName);
 points = 0;
}
  /* your code here - accessor(s) */ 
public String getName()
{
 return username;
}
public int getPoints()
{
 return points;
}

  /* your code here - mutator(s) */ 
     
}