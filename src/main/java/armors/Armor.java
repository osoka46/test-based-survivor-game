package armors;

public abstract class Armor {
    private int id;
    private String name;
    private int defence;
    private int cost;

    public Armor(String name, int id, int defence, int cost) {
        this.id=id;
        this.name = name;
        this.defence = defence;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
       this.id = id;
    }

    public int getDefence() {
        return this.defence;
    }

    public void setDefence(int damage) {
        this.defence = damage;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
