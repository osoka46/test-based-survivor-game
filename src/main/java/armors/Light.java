package armors;

public class Light extends Armor {
    private static final String NAME = "Light";
    private static final int ID = 1;
    private static final int DEFENCE =1;
    private static final int COST =15;

    public Light() {
        super(NAME,ID,DEFENCE,COST);
    }
}
