package com.software.person;

public class Man extends Person {
    private Woman partner;

    public Man(String firstName, String lastName, int age, int weight, int height) {
        super(firstName, lastName, age, weight, height);
        partner = null;
    }

    public boolean isRetired() {
        return getAge() > 65;
    }

    public void registerPartnership(Woman woman) {
        this.partner = woman;
        woman.setLastName(getLastName());
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            if (returnToPreviousLastName) {
                partner.setLastName(partner.getPreviousLastName());
            }
            partner = null;
        }
    }
}