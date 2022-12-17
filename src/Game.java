import java.util.HashMap;

public class Game {//main class of the game
    public static void main(String[] args){
        HashMap<Integer,Entity> ent = new HashMap<Integer,Entity>();
        HashMap<Integer,Equipment> arm = new HashMap<Integer,Equipment>();
        HashMap<Integer,Equipment> pot = new HashMap<Integer,Equipment>();
        HashMap<Integer,Weapons> wep = new HashMap<Integer,Weapons>();
        wep.put(1, Weapons.MythSword);
        wep.put(2, Weapons.dagger);
        wep.put(3, Weapons.bow);
        wep.put(4, Weapons.gun);
        wep.put(5, Weapons.sword);
        arm.put(1, Equipment.armour1);
        arm.put(2, Equipment.armour2);
        arm.put(3, Equipment.armour3);
        pot.put(1, Equipment.heal);
        pot.put(2, Equipment.amplify);
        pot.put(3, Equipment.fortify);
        pot.put(4, Equipment.precision);
        ent.put(0, Entity.Player);
        ent.put(1, Entity.Pufferfish);
        ent.put(2, Entity.Dragon);
        ent.put(3, Entity.Golem);
        ent.put(4, Entity.Giant);
        ent.put(5, Entity.Mage);
        ent.put(6, Entity.Warrior);
        ent.put(7, Entity.Zombie);
        ent.put(8, Entity.Robot);
        ent.put(9, Entity.Golem);
        ent.put(10, Entity.Golem);
        ent.put(11, Entity.Golem);
        ent.put(12, Entity.Giant);
        ent.put(13, Entity.Giant);
        ent.put(14, Entity.Giant);
        ent.put(15, Entity.Zombie);
        ent.put(16, Entity.Zombie);
        ent.put(17, Entity.Zombie);
        ent.put(18, Entity.Zombie);
        ent.put(19, Entity.Zombie);
        ent.put(20, Entity.Robot);
        ent.put(21, Entity.Robot);
        ent.put(22, Entity.Robot);
        ent.put(23, Entity.Robot);
        ent.put(24, Entity.Robot);
        ent.put(25, Entity.Mage);
        ent.put(26, Entity.Mage);
        ent.put(27, Entity.Mage);
        ent.put(28, Entity.Mage);
        ent.put(29, Entity.Warrior);
        ent.put(30, Entity.Warrior);
        int wepchoice=2,armchoice=3;
        Weapons weapon = wep.get(wepchoice);
        Equipment armour = arm.get(armchoice);
            int mob = (int) Math.ceil(Math.random() * 30);
            Entity entity = ent.get(mob);
            //display you have encountered entity.name , TATAKAE!!
            Entity.Player.hp+=armour.hp;
            Entity.Player.def+=armour.def;
            while(entity.hp>0 && Entity.Player.hp>0) {
                Entity.Player.hp -= Math.max(0,damage(entity) - (Entity.Player.def));
                int potchoice = 1;
                switch(potchoice){
                    case 1: Entity.Player.hp+=pot.get(1).buff;break;//display you have healed ur self
                    case 2: Entity.Player.atk+=pot.get(2).buff;break;//display you have amplified ur power
                    case 3: Entity.Player.def+=pot.get(3).buff;break;//display you have fortified ur self
                    case 4: Entity.Player.acc+=pot.get(4).buff;break;//display u got better eyes
                    default: entity.hp-= (damage(Entity.Player , weapon ));
                }
            }
        if (entity.hp <= 0) {
            //display you have defeated entity.name
        }else {
            //display entity.name has defeated you
        }

        }
    static int damage(Entity entity){
        if(entity!=Entity.Mage){
            long hit = Math.round(Math.random()*100);
            if(hit<= entity.acc){
                return entity.atk;
            }
            else return 0;
        }
        else {
            return (int)(Entity.Player.hp * 0.3);
        }
    }
    static int damage(Entity entity, Weapons weapon){
        long hit = Math.round(Math.random()*100);
        int attack;
        if(hit<= (entity.acc+ weapon.accuracy)) {
            long crit = Math.round(Math.random() * 100);
            if (crit <= weapon.critRate) {
                attack = (entity.atk + weapon.atk) * 2;
            } else {
                attack = (entity.atk + weapon.atk);
            }
            return attack;
        }else {
            return 0;
        }
    }
}
