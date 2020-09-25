public class healer {
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

    public healer(String n) {
        name = n;
        level = 1;
        maxhealth = 16;
        health = maxhealth;
        attack = 4;
        defense = 6;
        magicattack = 5;
        magicdefense = 10;
        agility = 3;
        wisdom = 12;
        exp = 0;
    }
    public healer(String n, int lev) {
        name = n;
        level = lev;
        maxhealth = 16 * lev;
        health = maxhealth;
        attack = 4 * lev;
        defense = 6 * lev;
        magicattack = 5 * lev;
        magicdefense = 10 * lev;
        agility = 3 * lev;
        wisdom = 12 * lev;
        exp = 0;

    }
    public void levelup() {
        level++;
        maxhealth += 16;
        health += 16;
        attack += 4;
        defense += 6;
        magicattack += 5;
        magicdefense += 10;
        agility += 3;
        wisdom += 12;
    }
    public void gainexp(int expgain) {
        if (expgain > 1000)
            expgain = 1000;
        exp += expgain;
        if (exp >= 1000) {
            levelup();
            exp -= 1000;
        }
    }

    public String toString() {
        String str = "";
        str += "name: " + name + "\n";
        str += "level " + level + "healer \n";
        str += "current exp: " + exp + "\n";
        str += health + "/" + maxhealth + " health \n";
        str += "attack: " + attack + "  defense: " + defense + "\n";
        str += "magic attack: " + magicattack + "  Magic Defense: " + magicdefense + "\n";
        str += "agility: " + agility + "  Wisdom: " + wisdom + "\n\n";
        return str;
    }



    public int attack(int targetdef, int targetagi) {
        boolean hit = hitcheck(targetagi);
        if (hit)
            return calcdamage(targetdef);
        else
            return 0;

    }

    private boolean hitcheck(int targetagi) {
        double probability = (double) agility / targetagi;
        if (Math.random() < probability) {
            System.out.println("Hit!");
            return true;
        } else {
            System.out.println("Miss!");
            return false;
        }
    }
    private int calcdamage(int targetdef) {
        int damage = (int)(1.36 * attack * Math.pow(2.72, -(double) targetdef / attack));
        System.out.println(damage + " Damage!");
        return damage;

    }
    public int heal(int targethealth, int targetmaxhealth) {
        int heal = wisdom;
        if (heal > targetmaxhealth - targethealth)
            heal = targetmaxhealth - targethealth;
        System.out.println("Heal " + heal);
        return heal;

    }

}