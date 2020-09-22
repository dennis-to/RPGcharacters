public class rpgcharacters{

    public static void main(String[] args) {
        
        warrior c1 = new warrior("Jim");
        warrior c2 = new warrior("Bob");
        warrior c3 = c1;
        warrior c4 = new warrior("Rushil", 10);
        warrior c5 = new warrior("Jeff", 69);


        System.out.println(c1);
        c1.gainexp(2020);
        System.out.print(c1);
        c1.gainexp(500);
        System.out.print(c1);
        c1.gainexp(600);
        System.out.print(c1);

    }

}