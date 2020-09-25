public class warrior {

private String name;
private int level;
private int maxhealth;
private int health;
private int attack;
private int magicattack;
private int defense;
private int magicdefense;
private int agility;
private int wisdom;
private int exp;

    public warrior(String n){
        name = n;
        level = 1;
        maxhealth = 20;
        health = maxhealth;
        attack = 10;
        defense = 8;
        magicattack = 0;
        magicdefense = 4;
        agility = 7;
        wisdom = 2;
        exp = 0;
    }
    public warrior(String n, int lev){
        name = n;
        level = lev;
        maxhealth = 20 * lev;
        health = maxhealth;
        attack = 10 * lev;
        defense = 8 * lev;
        magicattack = 0 * lev;
        magicdefense = 4 * lev;
        agility = 7 * lev;
        wisdom = 2 * lev;
        exp = 0; 

    }
    public void levelup(){
        level ++;
        maxhealth += 20;
        health += 20;
        attack += 10;
        defense += 8;
        magicdefense += 4;
        agility += 7;
        wisdom += 2;
    }
    public void gainexp(int expgain){
        if(expgain > 1000)
            expgain = 1000;
        exp += expgain;
        if(exp >= 1000){
            levelup();
            exp -= 1000;
        }
    }

    public String toString(){
        String str = "";
        str += "name: " + name + "\n";
        str += "level " + level + "warrior \n";
        str += "current exp: " + exp + "\n";
        str += health + "/" + maxhealth + " health \n";
        str += "attack: " + attack + "  defense: " + defense + "\n";
	    str += "magic attack: " + magicattack + "  Magic Defense: " + magicdefense + "\n";
	    str += "agility: " + agility + "  Wisdom: " + wisdom + "\n\n";
	    return str;
	}

    public int attack(int targetdef, int targetagi){
        boolean hit = hitcheck(targetagi);
        if(hit)
            return calcdamage(targetdef);
        else
            return 0;

    }

    private boolean hitcheck(int targetagi){
        double probability = (double)agility/targetagi;
        if(Math.random() < probability){
            System.out.println("Hit!");
            return true;
        }
        else{
            System.out.println("Miss!");
            return false;
        }
    }
    private int calcdamage(int targetdef){
        int damage = (int)(1.36*attack*Math.pow(2.72, -(double)targetdef/attack));
        System.out.println(damage + " Damage!");
        return damage;


    }

}
