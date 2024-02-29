package ProductModel;

import java.time.LocalDate;

public class Product {
    private String id;
    private String name;
    private double price;
    private int qty;
    LocalDate localDate;

    public Product(String id, String name, double price,int qty,LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty=qty;
        this.localDate=localDate;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", localDate=" + localDate +
                '}';
    }
}
