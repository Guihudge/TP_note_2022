package fr.ubx.poo.tpnote.subscription;

public enum SubscriptionLevel {
    STANDARD(11.0),
    PREMIUM(15.0),
    STUDENT(9.0);

    private final double cost;

    SubscriptionLevel(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
