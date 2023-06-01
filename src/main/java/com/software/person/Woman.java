package com.software.person;

public class Woman extends Person {
    private Man partner;
    private String previousLastName;

    public Woman(String firstName, String lastName, int age, int weight, int height) {
        super(firstName, lastName, age, weight, height);
        previousLastName = lastName;
        partner = null;
    }

    public boolean isRetired() {
        return getAge() > 60;
    }

    public void registerPartnership(Man man) {
        this.partner = man;
        setLastName(man.getLastName());
    }
    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            if (returnToPreviousLastName) {
                setLastName(previousLastName);
            }
            partner = null;
        }
    }
}