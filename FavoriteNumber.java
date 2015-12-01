import java.io.Console;

public class FavoriteNumber {
  public static void main(String[] arg) {
    Console myConsole = System.console();

    System.out.println("what is your favorite number");
    String favoriteNumber = myConsole.readLine();
    System.out.println("Your favorite number is " + favoriteNumber + "? Me Too!");
  }
}
