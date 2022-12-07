package fr.ubx.poo.tpnote.subscription;

public class FamilySubscription extends Subscription {
    private int nbUsers = 0;
    private int nbUsersMax;

    public FamilySubscription(String email, int MaxUser) {
        super(email, 18.0);
        nbUsersMax = MaxUser;
    }

    @Override
    public int getNbUsers() {
        return nbUsers;
    }

    public int addUsers(int nbToAdd) {
        if (nbToAdd + this.nbUsers > this.nbUsersMax) {
            int addedUser = this.nbUsersMax - this.nbUsers;
            this.nbUsers = this.nbUsersMax;
            return addedUser;
        } else {
            this.nbUsers += nbToAdd;
            return nbToAdd;
        }
    }

    public int addUser() {
        return addUsers(1);
    }

    @Override
    public String toString() {
        return "Family Subscription " + super.toString() + "nb users=" + nbUsers + "]";
    }
}