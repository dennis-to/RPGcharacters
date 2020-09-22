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
    
        public healer(String n){
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
        }
        public healer(String n, int lev){
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
    
        }
        
    }
