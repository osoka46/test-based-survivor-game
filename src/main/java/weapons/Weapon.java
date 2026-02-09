package weapons;

public abstract class Weapon {
    private int id;
    private String name;
    private int damage;
    private int money;

    public Weapon(String name,int id, int damage, int money) {
        this.id=id;
        this.name = name;
        this.damage = damage;
        this.money = money;
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

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
