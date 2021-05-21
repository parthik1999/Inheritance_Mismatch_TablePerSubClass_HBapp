package com.parthik.beans;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity 

public class ContractualEmployee extends Employee{
	
	private int workedDay;
	private int costPerDay;
	
	public ContractualEmployee() {
		// TODO Auto-generated constructor stub
	}

	public int getWorkedDay() {
		return workedDay;
	}

	public void setWorkedDay(int workedDay) {
		this.workedDay = workedDay;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [workedDay=" + workedDay + ", costPerDay=" + costPerDay + "]";
	}
	
	

}
