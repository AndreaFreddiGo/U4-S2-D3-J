package entities;

import java.util.Random;

public class Product {
    private long id;
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        Random random = new Random();
        this.id = random.nextLong();
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
