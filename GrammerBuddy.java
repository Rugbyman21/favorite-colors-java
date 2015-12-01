import java.io.Console;

public class GrammerBuddy {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a noun.");
    String myNoun = myConsole.readLine();
    System.out.println("Give me a adjective");
    String myAdjective = myConsole.readLine();

    System.out.println(myNoun + " " + myAdjective + " to the store.");
  }
}
