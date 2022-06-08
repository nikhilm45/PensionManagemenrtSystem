package com.pensionerDisbursementMicroservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Getter
@Setter
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
