package com.univ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.univ.dao.StudentDao;
import com.univ.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("\t \t *********** Spring Core ORM Application Started Here....!!");

		
		ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// Menu Driven Application
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (flag)
		{
			System.out.println();
			System.out.println("\t 1. Add New Student");
			System.out.println("\t 2. Displaly All Student Details");
			System.out.println("\t 3. Display Single Student Details");
			System.out.println("\t 4. Delete Student");
			System.out.println("\t 5. Update Student");
			System.out.println("\t 6. Exit");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("\t Enter Your Choice : ");
				int choice = Integer.parseInt(br.readLine());
				switch (choice)
				{
				case 1:
					// Add New Student
					
					Student student = new Student();
					System.out.println();
					
					//Getting And Setting Student Name
					System.out.print("\t Enter Student Name : ");
					student.setStudName(sc.nextLine().trim());
					System.out.println();
					
					// Setting Student City
					System.out.print("\t Enter Student City : ");
					student.setStudCity(sc.nextLine().trim().toUpperCase());
					
					
					// Inserting student object to database by calling Insert service from StudentDao 
					int row = studentDao.insert(student);
					System.out.println();
					System.out.println("\t \t \t Record Inserted : " + row);
					System.out.println("\t ****************************************");
					break;

				case 2:
					// Displaying All Student Information
					List<Student> allStudent = studentDao.getAllStudents();
					System.out.println();
					System.out.println("\t\t Studnet Id \t\t Studnet Name \t\t Student City");
					System.out.println("\t ------------------------------------------------------------------------------------");
					
					for (Student s : allStudent) {
						System.out.println("\t\t\t" +s.getSid()+ "\t\t\t" +s.getStudName()+ "\t\t\t\t" +s.getStudCity());
					}
					break;
					
				case 3:
					// Display Single Student Details
					System.out.println();
					System.out.print("\t\t Enter Student Id \t : ");
					int sidForDisplay = Integer.parseInt(br.readLine());
					Student s = studentDao.getStudent(sidForDisplay);
					System.out.println();
					System.out.println("\t\t\t Student Id \t \t : "+s.getSid());
					System.out.println("\t\t\t Student Name \t : "+s.getStudName());
					System.out.println("\t\t\t Student City \t : "+s.getStudCity());
					System.out.println("\t\t ----------------------------------------------------------------");
					break;
				case 4:
					// Delete Student
					System.out.println();
					System.out.print("\t\t Enter Student Id \t : ");
					int sidForDelete = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(sidForDelete);
					System.out.println();
					System.out.println("\t\t *********************************************************");
					System.out.println("\t\t\t Student Information Deleted Successfully ");
					System.out.println("\t\t*********************************************************");
					break;
				case 5:
					System.out.println();
					Student student1 = new Student();
					System.out.println();
					
					//Getting And Setting Student Name
					System.out.print("\t Enter Student Id : ");
					student1.setSid(sc.nextInt());
					System.out.println();
					System.out.print("\t Enter Student Name : ");
					student1.setStudName(sc.nextLine().trim());
					student1.setStudName(sc.nextLine().trim());
					System.out.println();
					
					// Setting Student City
					System.out.print("\t Enter Student City : ");
					student1.setStudCity(sc.nextLine().trim().toUpperCase());
					studentDao.updateStudent(student1);
					System.out.println();
					System.out.println("\t\t *********************************************************");
					System.out.println("\t\t\t Student Information Updated Successfully ");
					System.out.println("\t\t*********************************************************");
					break;
				case 6:
					flag = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("\t ***** Invalid Input, Try Again...!!");
				System.out.println("\t " + e.getMessage());
			}
		}
		System.out.println();
		System.out.println("\t ****************************************");
		System.out.println("\t\t Thank you... Visit Again..!!");
		System.out.println("\t ****************************************");
	}
}