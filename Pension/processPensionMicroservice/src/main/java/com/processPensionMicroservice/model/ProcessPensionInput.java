package com.processPensionMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class ProcessPensionInput {

	private Long aadharNumber;
	private Double pensionAmount;
	private double serviceCharge;
	public ProcessPensionInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProcessPensionInput(Long aadharNumber, Double pensionAmount, double serviceCharge) {
		super();
		this.aadharNumber = aadharNumber;
		this.pensionAmount = pensionAmount;
		this.serviceCharge = serviceCharge;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public Double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(Double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

}
