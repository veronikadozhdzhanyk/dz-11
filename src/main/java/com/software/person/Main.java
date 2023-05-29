package com.software.person;

public class Main {
    public static void main(String[] args) {
        Man john = new Man("Oleg", "Prutyla", 66,75,185);
        Woman jane = new Woman("Olga", "Danyluk",59 , 62,168);

        System.out.println("Man: " + john.getFirstName() + " " + john.getLastName() + ", Age: " + john.getAge() + ", Weight:"+john.getWeight()+ ", Height:" +john.getHeight());
        System.out.println("Woman: " + jane.getFirstName() + " " + jane.getLastName() + ", Age: " + jane.getAge() + ", Weight:"+jane.getWeight()+ ", Height:" +jane.getHeight());

        john.registerPartnership(jane);

        System.out.println("Man is retired: " + john.isRetired());
        System.out.println("Woman is retired: " + jane.isRetired());

        john.deregisterPartnership(true);

        System.out.println("Man: " + john.getFirstName() + " " + john.getLastName() + ", Age: " + john.getAge() + ", Weight:"+john.getWeight()+ ", Height:" +john.getHeight());
        System.out.println("Woman: " + jane.getFirstName() + " " + jane.getLastName() + ", Age: " + jane.getAge() + ", Weight:"+jane.getWeight()+ ", Height:" +jane.getHeight());
    }
}