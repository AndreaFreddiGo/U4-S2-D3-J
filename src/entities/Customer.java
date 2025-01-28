package entities;

import java.util.Random;

public class Customer {
    private long id;
    private String name;
    private int tier;


    public Customer(String name, int tier) {
        Random random = new Random();
        this.id = random.nextLong();
        this.name = name;
        this.tier = tier;
    }
}