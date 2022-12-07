package fr.ubx.poo.tpnote.subscription;

public abstract class Subscription {

    private String mailAddress;
    private double cost;

    public Subscription(String mailAddress, double cost) {
        this.mailAddress = mailAddress;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "[cost(month)=" + cost + ", mail address=" + mailAddress + ", ";
    }

    public int getNbUsers() {
        return -1;
    }
}
