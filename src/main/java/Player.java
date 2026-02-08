import java.util.Scanner;

public class Player {
    private String playerName;
    private Scanner scanner = new Scanner(System.in);


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }



    public Character selectChar(){
        Character [] characters = {new Samurai(),new Archer(),new Knight()};
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
        return characters[selectedCharId-1];
    }

    public void selectedCharInfo(Character character){
        System.out.println("Name: " +character.getName()+
                "\tID: "+character.getId()+
                "\tDamage: "+character.getDamage()+
                "\tHealth: "+character.getHealth()+
                "\tMoney: "+character.getMoney());
    }

}
