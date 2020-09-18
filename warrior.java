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

    }
    
}
