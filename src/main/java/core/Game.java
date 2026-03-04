package core;

import locations.Location;
import locations.SafeHouse;
import locations.ToolStore;

import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);
    private Player player;


    public void start(){
        System.out.println("Welcome.");
        System.out.print("Please enter a name: ");

        String playerName = input.nextLine();
        player = new Player();
        player.setPlayerName(playerName);
        player.selectChar();
        selectLocation();
    }

    private void selectLocation(){
        Location  location = null;
        int selectedLoc;

        while (true){
            System.out.println("Please select a location.\nLocations:");
            System.out.println("1 - Safe house. You can full your health.");
            System.out.println("2 - Tool house. You can buy items.");
            System.out.print("Please a lotion to go:");
            selectedLoc = input.nextInt();

            switch (selectedLoc){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default: new SafeHouse(player);
            }
            if (!location.onLocation()){
                System.out.println("Game over.");
            }

        }



    }
}
