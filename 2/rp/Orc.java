package rp;

public class Orc extends Character {
    private OrcType type;

    public Orc(String name, OrcType type) {
        super(name);
        this.type = type;
    }

    @Override
    public void defend(int damage) {
        double calculatedDamage = type.getDamageMultiplier() * damage;
        hp += calculatedDamage;
        System.out.println(
                name + " took " + calculatedDamage + " damage, and is " + (isAlive ? "alive" : "dead")
        );
    }
}
