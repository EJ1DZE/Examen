package org.example;

public class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;

    // Конструктор
    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-30s | %-15s | %10.2f | %5d", name, category, price, quantity);
    }
}

