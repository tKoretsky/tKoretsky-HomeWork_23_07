abstract public class Unit implements Actionable {
    private String name;
    private int health;
    private int damage;
    protected int maxHP;

    protected Unit(String _name, int _health, int _damage, int _maxHP) {
        name = _name;
        health = _health;
        damage = _damage;
        maxHP = _maxHP;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(Unit target) {
        target.setHealth(target.getHealth() - this.getDamage());
        System.out.println(getName() + " hit the " + target.getName() + " " + getDamage() + " damage");
    }

    @Override
    public void healing(int medKit) {
        System.out.println(getName() + " Use a medkit and up " + medKit + "HP");
        if ((getHealth() + medKit) > maxHP) {
            setHealth(maxHP);
        } else {
            setHealth(getHealth() + medKit);
        }
    }

    @Override
    public String toString() {
        return "Unit{" + getName() + ", health=" + health + '}';
    }
}
