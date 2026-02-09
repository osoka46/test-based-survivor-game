package weapons;

public class Pistol extends Weapon {
    private static final String NAME = "weapons.Pistol";
    private static final int ID = 1;
    private static final int DAMAGE =2;
    private static final int MONEY =25;

    public Pistol() {
        super(NAME,ID,DAMAGE,MONEY);
    }
}
