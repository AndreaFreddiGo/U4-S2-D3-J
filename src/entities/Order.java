package entities;

import enums.Status;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
    private long id;
    private Status status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Status status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        Random random = new Random();
        this.id = random.nextLong();
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }
}
