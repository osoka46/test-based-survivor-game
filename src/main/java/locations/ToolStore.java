package locations;

import armors.Armor;
import armors.Heavy;
import armors.Light;
import armors.Middle;
import core.Player;
import weapons.Pistol;
import weapons.Rifle;
import weapons.Sword;
import weapons.Weapon;

public class ToolStore extends NormalLoc {
    private Player player;

    public ToolStore(Player player){
        super(player,"Tool store.");
        this.player =player;
    }

    @Override
   public boolean onLocation() {
       boolean checkStore = false;
       checkStore = enterToolStore();
        return true;
    }

    private boolean enterToolStore(){
        System.out.println("Welcome to store.");
        getAllArmorInfo();
        getAllWeaponInfo();
    }

    private Armor selectedArmorByID(int selectedId){
        Armor selectedArmor= null;
        Armor[]armors = {new Light(),new Middle(),new Heavy()};

        for (int i = 0;i<armors.length;i++ ){
            if (armors[i].getId()==selectedId){
                selectedArmor = armors[i];
            }
        }
        return selectedArmor;
    }
    private void getAllArmorInfo(){
        Armor[]armors = {new Light(),new Middle(),new Heavy()};
        System.out.println("Armors in store:");

        for (Armor temp:armors){
            System.out.println(temp.getName() +
                    "\nID: "+temp.getId()+
                    "\tDefence: "+temp.getDefence()+
                    "\tCost: "+temp.getCost());
        }
    }

    private Weapon selectedWeapon(int selectedId){
        Weapon []weapons = {new Pistol(),new Sword(),new Rifle()};
        Weapon selectedWeapon = null;

        for (int i= 0;i<weapons.length;i++){
            if (weapons[i].getId()==selectedId){
                selectedWeapon = weapons[i];
            }
        }
        return selectedWeapon;
    }


    private void getAllWeaponInfo(){
        Weapon []weapons = {new Pistol(),new Sword(), new Rifle()};
        System.out.println("Weapons in store:");
        for (Weapon weapon:weapons){
            System.out.println(weapon.getName()+
                    "\nID: "+weapon.getId()+
                    "\tDamage: "+weapon.getDamage()+
                    "\tCost: "+weapon.getCost());
        }
    }

    public boolean checkIfMoneyEnough(Armor armor){
        int playersMoney = this.player.getMoney();
        int armorsCost = armor.getCost();
        if (playersMoney >= armorsCost){
            return true;
        }else {
            return false;
        }
    }
}
