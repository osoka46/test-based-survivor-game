package weapons;

public class Rifle extends Weapon {
    private static final String NAME = "Rifle";
    private static final int ID =3;
    private static final int DAMAGE = 7;
    private static final int COST = 45;

    public Rifle() {
        super(NAME,ID,DAMAGE,COST);
    }
}
