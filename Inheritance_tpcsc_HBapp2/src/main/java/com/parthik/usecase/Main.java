package com.parthik.usecase;



import org.hibernate.Session;

import com.parthik.beans.ContractualEmployee;
import com.parthik.beans.Employee;
import com.parthik.beans.SalaryEmployee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		//store value
		Employee emp = new Employee();
		emp.setName("Parthik");
		
		ContractualEmployee cemp = new ContractualEmployee();
		cemp.setName("Shubham");
		cemp.setCostPerDay(350);
		cemp.setWorkedDay(10);
		
		SalaryEmployee semp = new SalaryEmployee();
		semp.setName("Rajessh");
		semp.setSalary(30000);
		
		ses.getTransaction().begin();
		
		ses.save(emp);
		ses.save(cemp);
		ses.save(semp);
		
		ses.getTransaction().commit();
		
		System.out.println("done");
	}
	
}
