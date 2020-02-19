package rp;

public class Hero extends Character {
    private double defense;

    public Hero(String name) {
        super(name);
        defense = Math.random() * 5 + 1;
    }

    @Override
    public void defend(int damage) {
        double calculatedDamage = damage / defense;
        hp -= calculatedDamage;
        System.out.println(
                name + " took " + calculatedDamage + " damage, and is " + (isAlive ? "alive" : "dead")
        );
    }
}
