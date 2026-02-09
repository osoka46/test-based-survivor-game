package monsters;

public class Zombie extends Monster{
    private static final String NAME= "Zombie";
    private static final int ID = 1;
    private static final int DAMAGE = 3;
    private static final int HEALTH =10;
    private static final int MONEY =4;

    public Zombie() {
        super(NAME,ID,DAMAGE,HEALTH,MONEY);
    }
}
