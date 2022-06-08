package com.pensionerDisbursementMicroservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PensionerDetail {

	private String name;
	private String dateOfBirth;
	private String pan;
	private double salary;
	private double allowances;
	private String pensionType;
	private Bank bank;
	
	public PensionerDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PensionerDetail(String name, String dateOfBirth, String pan, double salary, double allowances,
			String pensionType, Bank bank) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salary = salary;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bank = bank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
