 package com.parthik.beans;


import javax.persistence.Entity;

@Entity
public class SalaryEmployee extends Employee{
	
	private int salary;

	public SalaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + "]";
	}

	  
	

}
