package locations;

import core.Player;

public class SafeHouse extends NormalLoc {
    private Player player = new Player();

    public SafeHouse(Player player) {
        super(player,"Safe house.");
        this.player = player;
    }


    @Override
    public boolean onLocation() {
        System.out.println("You are home. Your health is now full.");

        player.setHealth(player.getHealth());

        return true;
    }
}
