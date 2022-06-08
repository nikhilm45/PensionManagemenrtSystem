package com.processPensionMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class ProcessPensionResponse {

	private int pensionStatusCode;

	public ProcessPensionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcessPensionResponse(int pensionStatusCode) {
		super();
		this.pensionStatusCode = pensionStatusCode;
	}

	public int getPensionStatusCode() {
		return pensionStatusCode;
	}

	public void setPensionStatusCode(int pensionStatusCode) {
		this.pensionStatusCode = pensionStatusCode;
	}

}
