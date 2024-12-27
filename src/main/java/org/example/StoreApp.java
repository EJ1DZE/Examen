package org.example;

import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Товар добавлен: " + product);
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Список товаров пуст.");
        } else {
            System.out.println(String.format("%-20s | %-15s | %-10s | %-5s", "Название", "Категория", "Цена", "Кол-во"));
            System.out.println("---------------------------------------------------------------");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
