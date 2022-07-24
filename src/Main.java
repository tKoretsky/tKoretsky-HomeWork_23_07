public class Main {
    public static void main(String[] args) {

        Barrack barrack = new Barrack();
        Unit barbarian = barrack.createUnit("barbarian");
        Unit archer = barrack.createUnit("Archer");
        Unit warrior = barrack.createUnit("Warrior");

        System.out.println(warrior.toString());
        System.out.println(archer.toString());
        warrior.attack(archer);
        System.out.println(archer.toString());
        archer.healing(25);
        System.out.println(archer.toString());
    }
}
