package locations;

import core.Player;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player){
        super(player,"Tool store.");
    }

    @Override
    boolean onLocation() {
        System.out.println("Welcome to store.");
        return false;
    }
}
