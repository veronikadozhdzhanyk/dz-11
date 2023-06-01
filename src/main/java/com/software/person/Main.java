package com.software.person;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Oleg", "Prutyla", 66,75,185);
        Woman woman = new Woman("Olga", "Danyluk",59 , 62,168);

        System.out.println("Man: " + man.getFirstName() + " " + man.getLastName() + ", Age: " + man.getAge() + ", Weight:"+man.getWeight()+ ", Height:" +man.getHeight());
        System.out.println("Woman: " + woman.getFirstName() + " " + woman.getLastName() + ", Age: " + woman.getAge() + ", Weight:"+woman.getWeight()+ ", Height:" +woman.getHeight());

        man.registerPartnership(woman);

        System.out.println("Man is retired: " + man.isRetired());
        System.out.println("Woman is retired: " + woman.isRetired());

        man.deregisterPartnership(true);

        System.out.println("Man: " + man.getFirstName() + " " + man.getLastName() + ", Age: " + man.getAge() + ", Weight:"+man.getWeight()+ ", Height:" +man.getHeight());
        System.out.println("Woman: " + woman.getFirstName() + " " + woman.getLastName() + ", Age: " + woman.getAge() + ", Weight:"+woman.getWeight()+ ", Height:" +woman.getHeight());
    }
}