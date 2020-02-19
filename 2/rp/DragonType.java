package rp;

public enum DragonType {
    RED(60),
    BLACK(20);

    private int hideThickness;

    DragonType(int hideThickness) {
        this.hideThickness = hideThickness;
    }

    int getHideThickness() {
        return this.hideThickness;
    }
}
