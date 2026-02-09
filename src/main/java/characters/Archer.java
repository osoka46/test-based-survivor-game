package characters;

public class Archer extends Character {
    private static final int ID =2;
    private static final int DAMAGE =7;
    private static final int HEALTH= 18;
    private static final int MONEY=20;
    private static final String NAME="Archer";

    public Archer() {
        super(ID,NAME,DAMAGE,HEALTH,MONEY);
    }
}
