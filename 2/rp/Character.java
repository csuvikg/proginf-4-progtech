package rp;

import java.util.Random;

public abstract class Character {
    String name;
    double hp;
    private int damage;
    boolean isAlive;

    Character(String name) {
        Random r = new Random();
        hp = r.nextInt(600) + 1;
        damage = r.nextInt(100) + 1;
        isAlive = true;
        this.name = name;
    }

    public void attack(Character c) {
        c.defend(damage);
    }

    public abstract void defend(int damage);
}
