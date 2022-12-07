package fr.ubx.poo.tpnote.simulation;

import fr.ubx.poo.tpnote.subscription.Subscription;

public class SubscriptionsSet {

    private Subscription[] subscriptionsList;
    private int subscriptionsListIndex = 0;
    private static final int maxSubscriptions = 10;

    public SubscriptionsSet() {
        subscriptionsList = new Subscription[maxSubscriptions];
    }

    public boolean addSubscription(Subscription sub) {
        if (subscriptionsListIndex + 1 > maxSubscriptions) {
            return false;
        } else {
            subscriptionsList[subscriptionsListIndex] = sub;
            subscriptionsListIndex++;
            return true;
        }
    }

    @Override
    public String toString() {
        String out = "";
        out += "Subscriptions info :\n" +
                "- total number : " + subscriptionsListIndex + "\n" +
                "- mean cost per user and per year : " + this.getMeanAnnualCostPerUser() + "\n";
        for (int i = 0; i < subscriptionsListIndex; i++) {
            out += subscriptionsList[i].toString() + "\n";
        }
        return out;
    }

    public double getMeanAnnualCostPerUser() {
        double totalCost = 0;
        double totalUser = 0;

        for (int i = 0; i < subscriptionsListIndex; i++) {
            totalCost += subscriptionsList[i].getCost();
            totalUser += subscriptionsList[i].getNbUsers();
        }

        return (totalCost * 12) / totalUser;
    }
}
