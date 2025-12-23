package com.univ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.dao.FruitDao;
import com.univ.entities.Fruit;

public class App {
    public static void main(String[] args) {
        System.out.println("\n\t\t*********** Spring Core ORM Fruit Application Started ***********");

        ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");
        FruitDao fruitDao = context.getBean("fruitDao", FruitDao.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;
        while (flag) {
            System.out.println("\n\t1. Add New Fruit");
            System.out.println("\t2. Display All Fruits");
            System.out.println("\t3. Display Single Fruit");
            System.out.println("\t4. Delete Fruit");
            System.out.println("\t5. Update Fruit");
            System.out.println("\t6. Exit\n");

            try {
                System.out.print("\tEnter your choice: ");
                int choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        // Add new fruit
                        System.out.print("\tEnter Fruit Name: ");
                        String name = br.readLine().trim();
                        if (name.isEmpty()) {
                            System.out.println("\t❌ Fruit name cannot be empty!");
                            break;
                        }

                        System.out.print("\tEnter Quantity: ");
                        int qty;
                        try {
                            qty = Integer.parseInt(br.readLine().trim());
                        } catch (NumberFormatException ex) {
                            System.out.println("\t❌ Invalid quantity.");
                            break;
                        }

                        System.out.print("\tEnter Price: ");
                        double price;
                        try {
                            price = Double.parseDouble(br.readLine().trim());
                        } catch (NumberFormatException ex) {
                            System.out.println("\t❌ Invalid price.");
                            break;
                        }

                        Fruit fruit = new Fruit();
                        fruit.setfName(name);
                        fruit.setQuantity(qty);
                        fruit.setPrice(price);

                        int id = fruitDao.insert(fruit);
                        System.out.println("\t✅ Fruit inserted successfully with ID: " + id);
                        break;

                    case 2:
                        // Display all fruits
                        List<Fruit> list = fruitDao.getAllFruits();
                        System.out.println("\n\tID\tName\t\tQuantity\tPrice");
                        System.out.println("\t---------------------------------------------");
                        for (Fruit f : list) {
                            System.out.println("\t" + f.getfId() + "\t" + f.getfName() + "\t\t" + f.getQuantity() + "\t\t" + f.getPrice());
                        }
                        break;

                    case 3:
                        // Display single fruit
                        System.out.print("\tEnter Fruit ID: ");
                        int fid = Integer.parseInt(br.readLine());
                        Fruit found = fruitDao.getFruit(fid);
                        if (found != null) {
                            System.out.println("\n\tID: " + found.getfId());
                            System.out.println("\tName: " + found.getfName());
                            System.out.println("\tQuantity: " + found.getQuantity());
                            System.out.println("\tPrice: " + found.getPrice());
                        } else {
                            System.out.println("\t❌ Fruit not found!");
                        }
                        break;

                    case 4:
                        // Delete fruit
                        System.out.print("\tEnter Fruit ID to delete: ");
                        int delId = Integer.parseInt(br.readLine());
                        fruitDao.deleteFruit(delId);
                        System.out.println("\t✅ Fruit deleted successfully.");
                        break;

                    case 5:
                        // Update fruit
                        System.out.print("\tEnter Fruit ID to update: ");
                        int updateId = Integer.parseInt(br.readLine());

                        Fruit existing = fruitDao.getFruit(updateId);
                        if (existing == null) {
                            System.out.println("\t❌ Fruit not found!");
                            break;
                        }

                        System.out.print("\tEnter New Name: ");
                        String newName = br.readLine().trim();
                        if (!newName.isEmpty()) existing.setfName(newName);

                        System.out.print("\tEnter New Quantity: ");
                        try {
                            int newQty = Integer.parseInt(br.readLine().trim());
                            existing.setQuantity(newQty);
                        } catch (NumberFormatException ex) {
                            System.out.println("\t❌ Invalid quantity, keeping old value.");
                        }

                        System.out.print("\tEnter New Price: ");
                        try {
                            double newPrice = Double.parseDouble(br.readLine().trim());
                            existing.setPrice(newPrice);
                        } catch (NumberFormatException ex) {
                            System.out.println("\t❌ Invalid price, keeping old value.");
                        }

                        fruitDao.updateFruit(existing);
                        System.out.println("\t✅ Fruit updated successfully.");
                        break;

                    case 6:
                        flag = false;
                        break;

                    default:
                        System.out.println("\t❌ Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("\t❗ Error: " + e.getMessage());
            }
        }

        System.out.println("\n\t****************************************");
        System.out.println("\t\tThank you... Visit Again..!!");
        System.out.println("\t****************************************");
    }
}
