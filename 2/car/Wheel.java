package car;

import java.util.List;

public class Wheel {
    private Rim rim;
    private Tire tire;
    private List<Bolt> bolts;

    public Wheel(Rim rim, Tire tire, List<Bolt> bolts) {
        this.rim = rim;
        this.tire = tire;
        this.bolts = bolts;
    }
}
