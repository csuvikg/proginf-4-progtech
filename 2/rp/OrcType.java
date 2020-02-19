package rp;

public enum OrcType {
    BERSERKER(2),
    GUARDIAN(0.5f);

    private double damageMultiplier;

    OrcType(double damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    double getDamageMultiplier() {
        return this.damageMultiplier;
    }
}
