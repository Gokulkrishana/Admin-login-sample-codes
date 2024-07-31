package com.rg.adminDTO;

public class Admin {
	private int id;
	private String adminName;
	private int salary;
	
	public Admin(int id, String adminName, int salary) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id+" "+ adminName +" "+salary;
	}

	
}
