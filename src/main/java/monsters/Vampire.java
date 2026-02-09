package monsters;

public class Vampire extends Monster{
    private static final String NAME= "Vampire";
    private static final int ID = 2;
    private static final int DAMAGE = 4;
    private static final int HEALTH =14;
    private static final int MONEY =7;

    public Vampire() {
        super(NAME,ID,DAMAGE,HEALTH,MONEY);
    }
}
