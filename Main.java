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

    String[] questAsignation = {"A ", "f","e","w ", "n","i","g","h","t","s ", "a","g","o, ", "y","o","u ", "w","e","r","e ", "t","r","a","v","e","l","i","n","g ", "m","e","r","r","i","l","y ", "w","i","t","h ", "a ", "b","a","n","d ", "o","f ", "f","e","l","l","o","w ", "a","d","v","e","n","t","u","r","e","r","s, ", "o","n ", "y","o","u","r ", "w","a","y ", "t","o ", "t","h","e ", "T","o","m","b ", "o","f ", "H","o","r","r","o","r","s, ", "w","h","e","n, ", "i","n ", "y","o","u","r ", "s","l","e","e","p, ", "a ", "m","e","s","s","e","n","g","e","r ", "o","f ", "s","o","r","t","s ", "i","n","t","e","r","r","u","p","t","e","d ", "y","o","u","r ", "b","l","i","s","s","f","u","l ", "d","r","e","a","m, ", "a","n","d ", "p","r","o","c","e","e","d","e","d ", "t","o ", "t","e","l","l ", "y","o","u: ", "\"L","e","u","c","o","s","i","a, ", "y","o","u ", "m","u","s","t ", "t","r","a","v","e","l ", "t","o ", "A","n","o","r","a","k's ", "C","a","s","t","l","e ", "w","h","e","r","e ", "y","o","u ", "w","i","l","l ", "n","e","e","d ", "t","o ", "r","e","s","c","u","e ", "h","i","m ", "f","r","o","m ", "O","g, ", "w","h","o ", "h","a","s ", "h","e","l","d ", "A","n","o","r","a","k ", "h","o","s","t","a","g","e! ", "Y","o","u ", "m","u","s","t ", "g","o ", "a","t ", "o","n","c","e, ", "o","r ", "t","h","e ", "e","n","t","i","r","e ", "k","i","n","g","d","o","m ", "w","i","l","l ", "c","o","l","l","a","p","s","e!\" ", "T","h","e","n ", "t","h","e ", "m","e","s","s","e","n","g","e","r ", "l","e","f","t ", "a","n","d ", "y","o","u ", "w","o","k","e ", "u","p."};

    pause(1000);
    for(int i = 0; i < questAsignation.length; i++)
    {
      System.out.print(questAsignation[i]);
      pause(50);
    }
    System.out.println();
    System.out.println();

    System.out.println("What do you do?");

  }
}