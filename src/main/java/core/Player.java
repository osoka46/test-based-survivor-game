package core;
import characters.Archer;
import characters.Character;
import characters.Knight;
import characters.Samurai;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String playerName;
    private Scanner scanner = new Scanner(System.in);


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Character selectChar(){
        Character[] characters = {new Samurai(),new Archer(),new Knight()};
        int selectedCharId ;

        System.out.println("Characters:");
        for (Character temp:characters){
            System.out.println("Name: "+temp.getName()+
                    "\tID: "+temp.getId()+
                    "\tDamage: "+temp.getDamage()+
                    "\tHealth: "+temp.getHealth()+
                    "\tMoney: "+temp.getMoney());
        }
        System.out.print("Please select a character with id number:");
        selectedCharId = scanner.nextInt();
        System.out.println("Dear "+this.playerName +", you have selected. "+characters[selectedCharId-1].getName()+
                "\nHis features are as followings: ");
        selectedCharInfo(characters[selectedCharId-1]);
        initGame(characters[selectedCharId-1]);
        return characters[selectedCharId-1];
    }

    public void selectedCharInfo(Character character){
        System.out.println("Name: " +character.getName()+
                "\nID: "+character.getId()+
                "\tDamage: "+character.getDamage()+
                "\tHealth: "+character.getHealth()+
                "\tMoney: "+character.getMoney());
    }

    public void initGame(Character character){
        this.charName = character.getName();
        this.damage = character.getDamage();
        this.playerName = getPlayerName();
        this.health = character.getHealth();
        this.money = character.getMoney();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
