package com.Example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurancedata")
public class InsuranceData implements Serializable {
	@Id
	@Column
	int policyno;
	
	@Column
	String name;
	
	@Column
	int tenure;
	
	@Column
	int amount;
	
	public int getTenure() {
		return tenure;
	}

	public void setTenure(int dept) {
		this.tenure = dept;
	}



	public int getPolicy() {
		return policyno;
	}

	public void setPolicy(int id) {
		this.policyno = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int marks) {
		this.amount = marks;
	}
	
	
	
}
