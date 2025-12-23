package com.univ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.dao.UniversalDao;
import com.univ.pojo.Universal;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("\t\t*********** Spring Core ORM Application Started Here....!!");

        ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");
        UniversalDao universalDao = context.getBean("universalDao", UniversalDao.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in); // Use this only where necessary
        boolean flag = true;

        while (flag) {
            try {
                System.out.println();
                System.out.println("\t 1. Add New Student");
                System.out.println("\t 2. Display All Student Details");
                System.out.println("\t 3. Display Single Student Details");
                System.out.println("\t 4. Delete Student");
                System.out.println("\t 5. Update Student");
                System.out.println("\t 6. Exit");
                System.out.println();
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        Universal universal = new Universal();
                        System.out.print("Enter new Universal fName: ");
                        universal.setFName(br.readLine().trim());

                        System.out.print("Enter new Universal sName: ");
                        universal.setsName(br.readLine().trim());

                        int row = universalDao.insert(universal);
                        System.out.println("\t\tRecord Inserted: " + row);
                        break;

                    case 2:
                        List<Universal> allUniversals = universalDao.getAllUniversal();
                        System.out.println();
                        System.out.println("\t\tUniversal Id\tFaculty Name\tStudent Name");
                        System.out.println("\t\t--------------------------------------------------------");

                        for (Universal s : allUniversals) {
                            System.out.println("\t\t" + s.getId() + "\t\t" + s.getFName() + "\t\t" + s.getsName());
                        }
                        break;

                    case 3:
                        System.out.print("Enter Universal Id: ");
                        int sidForDisplay = Integer.parseInt(br.readLine());
                        Universal s = universalDao.getUniversal(sidForDisplay);
                        if (s != null) {
                            System.out.println("\t\tStudent Id     : " + s.getId());
                            System.out.println("\t\tFaculty Name   : " + s.getFName());
                            System.out.println("\t\tStudent Name   : " + s.getsName());
                        } else {
                            System.out.println("\t\tNo record found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Universal Id to delete: ");
                        int sidForDelete = Integer.parseInt(br.readLine());
                        universalDao.deleteUniversal(sidForDelete);
                        System.out.println("\t\tUniversal Information Deleted Successfully");
                        break;

                    case 5:
                        Universal universal1 = new Universal();

                        System.out.print("Enter Student Id to Update: ");
                        universal1.setId(Integer.parseInt(br.readLine()));

                        System.out.print("Enter Updated Faculty Name: ");
                        universal1.setFName(br.readLine().trim());

                        System.out.print("Enter Updated Student Name: ");
                        universal1.setsName(br.readLine().trim());

                        universalDao.updateUniversal(universal1);
                        System.out.println("\t\tStudent Information Updated Successfully");
                        break;

                    case 6:
                        flag = false;
                        break;

                    default:
                        System.out.println("\tInvalid Choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("\t***** Invalid Input, Try Again...!!");
                System.out.println("\t" + e.getMessage());
            }
        }

        System.out.println("\t****************************************");
        System.out.println("\t\tThank you... Visit Again..!!");
        System.out.println("\t****************************************");
    }
}
