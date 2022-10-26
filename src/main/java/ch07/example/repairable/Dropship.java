package ch07.example.repairable;

public class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}
