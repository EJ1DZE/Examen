package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StoreApp app = new StoreApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите категорию: ");
                    String category = scanner.nextLine();
                    System.out.print("Введите цену: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введите количество: ");
                    int quantity = scanner.nextInt();
                    app.addProduct(new Product(name, category, price, quantity));
                    break;
                case 2:
                    app.listProducts();
                    break;
                case 3:
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректный ввод, попробуйте снова.");
            }
        }
    }
}