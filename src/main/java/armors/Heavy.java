package armors;

public class Heavy extends Armor {
    private static final String NAME = "Heavy";
    private static final int ID = 3;
    private static final int DEFENCE =5;
    private static final int COST =40;

    public Heavy() {
        super(NAME,ID,DEFENCE,COST);
    }
}
