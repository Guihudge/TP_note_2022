package fr.ubx.poo.tpnote.subscription;

public class IndividualSubscription extends Subscription {
    private SubscriptionLevel level;

    public IndividualSubscription(String mailAddress, SubscriptionLevel level) {
        super(mailAddress, level.getCost());
        this.level = level;
    }

    public IndividualSubscription(String mailAddress) {
        super(mailAddress, SubscriptionLevel.STANDARD.getCost());
        this.level = SubscriptionLevel.STANDARD;
    }

    @Override
    public int getNbUsers() {
        return 1;
    }

    @Override
    public String toString() {
        return "Individual Subscription " + super.toString() + "nb users=" + 1 + "]";
    }
}