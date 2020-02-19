package rp;

public class Dragon extends Character {
    private DragonType type;

    public Dragon(String name, DragonType type) {
        super(name);
        this.type = type;
    }

    @Override
    public void defend(int damage) {
        if (type.getHideThickness() < damage) {
            hp -= damage;
            isAlive = hp >= 0;
            System.out.println(
                    name + " took " + damage + " damage, and is " + (isAlive ? "alive" : "dead")
            );
        } else {
            System.out.println(
                    name + "'s thick hide defended the damage'"
            );
        }
    }
}
