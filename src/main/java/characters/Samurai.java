package characters;

public class Samurai  extends Character {
    private static final int ID = 1;
    private static final int DAMAGE =5;
    private static final int HEALTH=21;
    private static final int MONEY=15;
    private static final String NAME ="Samurai";

    public Samurai() {
        super(ID,NAME,DAMAGE,HEALTH,MONEY);
    }

}
