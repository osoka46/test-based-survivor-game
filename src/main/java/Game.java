import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);
    private Player player ;

    public void start(){
        System.out.println("Welcome.");
        System.out.print("Please enter a name: ");
        String playerName = input.nextLine();
        player = new Player();
        player.setPlayerName(playerName);
        player.selectChar();

    }
}
