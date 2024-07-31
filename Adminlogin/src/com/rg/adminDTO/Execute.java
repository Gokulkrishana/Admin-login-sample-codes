package com.rg.adminDTO;

import java.util.Scanner;

import com.rg.adminDAO.Daoimplement;

public class Execute {

	public static void main(String[] args) {
		
		Daoimplement dao = new Daoimplement();
		Scanner scan = new Scanner(System.in);
		System.out.println("Select your choice Insert/delete Admin:");
		String choice = scan.next();
		switch (choice) {
		case "insert":
			System.out.println("Enter Admin name :");
			String aname = scan.next();
			System.out.println("Enter Admin salary :");
			int salary = scan.nextInt();
			
			if(dao.insertAdmin(aname, salary)) {
				System.out.println("Successfully added!");
			}else {
				System.out.println("Something wrong!");
			}
			
			break;
		case "delete":
			System.out.println("Enter The admin name to delete:");
			String adminname = scan.next() ;
			if(dao.deleteAdmin(adminname)) {
				System.out.println("Successfully Deleted!");
			}else {
				System.out.println("Something wrong!");
			}
		default:
			break;
		}
	}

}
