import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class Main 
{
  public static void pause(int ms) 
  {
    try 
    {
      Thread.sleep(ms);
    } 
    catch (InterruptedException e) 
    {
      System.err.format("IOException: %s%n", e);
    }
  }

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    String[] name = {"L", "e", "u", "c", "o", "s", "i", "a", "'", "s ", "Q", "u", "e", "s", "t"};

    System.out.println();
    pause(1000);
    for(int i = 0; i < name.length; i++)
    {
      System.out.print(name[i]);
      pause(100);
    }
    System.out.println();
    System.out.println();
    pause(1000);
    System.out.println("Press Enter to Start");
    String start = scanner.nextLine();

    String[] questAsignation = {"F","o","r ", "t","h","e ", "p","a","s","t ", "f","e","w ", "d","a","y","s, ", "y","o","u ", "h","a","v","e ", "b","e","e","n ", "t","r","a","v","e","l","i","n","g ", "w","i","t","h ", "s","o","m","e ", "f","e","l","l","o","w ", "a","d","v","e","n","t","u","r","e","r","s ", "o","n ", "y","o","u","r ", "w","a","y ", "t","o ", "t","h","e ", "T","o","m","b ", "o","f ", "H","o","r","r","o","r","s. ", "T","h","e","n, ", "i","n ", "y","o","u","r ", "s","l","e","e","p ", "o","n","e ", "n","i","g","h","t, ", "a ", "m","e","s","s","e","n","g","e","r ", "o","f ", "s","o","r","t","s ", "i","n","t","e","r","r","u","p","t","e","d ", "y","o","u","r ", "b","l","i","s","s","f","u","l ", "d","r","e","a","m, ", "a","n","d ", "p","r","o","c","e","e","d","e","d ", "t","o ", "t","e","l","l ", "y","o","u: ", "\"L","e","u","c","o","s","i","a, ", "y","o","u ", "m","u","s","t ", "t","r","a","v","e","l ", "t","o ", "A","n","o","r","a","k's ", "C","a","s","t","l","e ", "w","h","e","r","e ", "y","o","u ", "w","i","l","l ", "n","e","e","d ", "t","o ", "r","e","s","c","u","e ", "h","i","m ", "f","r","o","m ", "O","g, ", "w","h","o ", "h","a","s ", "h","e","l","d ", "A","n","o","r","a","k ", "h","o","s","t","a","g","e! ", "Y","o","u ", "m","u","s","t ", "g","o ", "a","t ", "o","n","c","e, ", "o","r ", "t","h","e ", "e","n","t","i","r","e ", "k","i","n","g","d","o","m ", "w","i","l","l ", "f","a","l","l ", "i","n ", "d","i","s","a","r","r","a","y!\" ", "T","h","e","n ", "t","h","e ", "m","e","s","s","e","n","g","e","r ", "d","i","s","a","p","p","e","a","r","e","d ", "a","n","d ", "y","o","u ", "w","o","k","e ", "u","p."};

    pause(1000);
    for(int i = 0; i < questAsignation.length; i++)
    {
      System.out.print(questAsignation[i]);
      pause(50);
    }
    System.out.println();
    System.out.println();

		String[] initialSurroundings = {"A","n","o","r","a","k's ","C","a","s","t","l","e ", "i","s ", "t","o ", "t", "h","e ", "N","o","r","t","h, ", "b","u","t ", "t","h","e","r","e ", "i","s ", "a ", "l","a","r","g","e ", "m","o","u","n","t","a","i","n ", "r","a","n","g","e ", "i","n ", "t","h", "e ", "w","a","y, ", "a","l","o","n","g ", "w","i","t","h ", "s","o","m","e ", "m","i","d ", "l","e","v","e","l ", "m","o","n","s","t","e","r","s. ", "T","h","e","r","e ", "i","s ", "a","l","s","o ", "a ", "l","a","r","g","e ", "l","a","k","e ", "t","o ", "t","h","e ", "W","e","s","t, ", "w","i","t","h ", "m","a","n","y ", "h","i","g","h ", "l","e","v","e","l ", "m","o","n","s","t","e","r","s ", "along the way; ", "h","o","w","e","v","e","r, ", "i","t ", "i","s ", "t","h","e ", "s","h","o","r","t","e","s","t ", "r","o","u","t","e ", "a","n","d ", "t","a","k","e","s ", "t","h","e ", "l","e","a","s","t ", "a","m","o","u","n","t ", "o","f ", "t","i","m","e. ", "T","h","e","n, ", "t","h","e","r","e ", "i","s ", "a ", "f","o","r","e","s","t ", "t","o ", "t","h","e ", "E","a","s","t, ", "w","i","t","h ", "m","a","n","y ", "l","o","w ", "l","e","v","e","l ", "m","o","n","s","t","e","r","s ", "a","l","o","n","g ", "t","h","e ", "w","a","y; ", "h","o","w","e","v","e","r, ", "i","t ", "i","s ", "t","h","e ", "l","o","n","g","e","s","t ", "r","o","u","t","e ", "a","n","d ", "t","a","k","e","s ", "t","h","e ", "m","o","s","t ", "a","m","o","u","n","t ", "o","f ", "t","i","m","e. ", "L","a","s","t","l","y, ", "y","o","u","r ", "b","a","n","d ", "o","f ", "a","d","v","e","n","t","u","r","e","r","s ", "a","r","e ", "h","e","a","d","i","n","g ", "s","o","u","t","h ", "t","o ", "c","o","n","t","i","n","u","e ", "t","o","w","a","r","d","s ", "t","h","e ", "T","o","m","b ", "o","f ", "H","o","r","r","o","r","s."};
	
		pause(2500);
    for(int i = 0; i < initialSurroundings.length; i++)
    {
      System.out.print(initialSurroundings[i]);
      pause(50);
    }
    System.out.println();
    System.out.println();

		boolean ans1 = false;
		boolean ans1N = false;
		boolean ans1S = false;
		boolean ans1E = false;
		boolean ans1W = false;

		while(ans1 == false)
		{
			System.out.println("What do you do?");
			String first = scanner.nextLine().toLowerCase();

			if(first.equals("go north"))
			{
				ans1 = true;
				ans1N = true;
				ans1S = false;
				ans1E = false;
				ans1W = false;
				System.out.println("You start heading North to the mountains");
				System.out.println();
			}
			else if (first.equals("go south"))
			{
				ans1 = true;
				ans1N = false;
				ans1S = true;
				ans1E = false;
				ans1W = false;
				System.out.println("You decide to continue South with your fellow travelers.");
				System.out.println();
			}
			else if (first.equals("go east"))
			{
				ans1 = true;
				ans1N = false;
				ans1S = false;
				ans1E = true;
				ans1W = false;
				System.out.println("You begin heading East toward the forest.");
				System.out.println();
			}
			else if (first.equals("go west"))
			{
				ans1 = true;
				ans1N = false;
				ans1S = false;
				ans1E = false;
				ans1W = true;
				System.out.println("You head West toward the lake.");
				System.out.println();
			}
			else
			{
				ans1 = false;
				ans1N = false;
				ans1S = false;
				ans1E = false;
				ans1W = false;
				System.out.println("I don't understand");
				System.out.println();
			}
		}
	}
}