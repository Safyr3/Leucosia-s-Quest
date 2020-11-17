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
    pause(50);
    System.out.println("Press Enter to Start");
    String start = scanner.nextLine();

    String[] backstory = {"A ", "few ", "nights ", "ago, ", "you ", "were ", "traveling ", "merrily ", "with ", "a ", "band ", "of ", "fellow ", "adventurers ", "on ", "your ", "way ", "to ", "the ", "Tomb ", "of ", "Horrors, ", "when, ", "in ", "your ", "sleep ", "one ", "night, ", "a ", "messenger ", "of ", "sorts ", "interrupted ", "your ", "dream. ", "The ", "messenger ", "told ", "you: ", "\"Leucosia, ", "you ", "must ", "travel ", "to ", "Anorak's ", "Castle ", "where ", "you ", "must ", "rescue ", "him ", "from ", "Og, ", "who ", "has ", "held ", "Anorak ", "hostage! ", "You ", "must ", "go ", "at ", "once, ", "or ", "you ", "will ", "live ", "with ", "eternal ", "guilt ", "and ", "shame!\" ", "Then ", "the ", "messenger ", "left ", "and ", "you ", "woke ", "up."};

    for(int i = 0; i < backstory.length; i++)
    {
      System.out.print(backstory[i]);
      pause(100);
    }
    System.out.println();
    System.out.println();

    
  }
}