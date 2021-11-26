package com.practo.ip.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect
@JsonIgnoreProperties
public class Admission implements Serializable {

	private static final long serialVersionUID = 1L;
	
	

	public Admission(String admissionId, String patMRNo, String patFirstName, String patLastName) {
		super();
		this.admissionId = admissionId;
		this.patMRNo = patMRNo;
		this.patFirstName = patFirstName;
		this.patLastName = patLastName;
	}

	private String admissionId;

	private String patMRNo;

	private String patFirstName;

	private String patLastName;

	public String getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}

	public String getPatMRNo() {
		return patMRNo;
	}

	public void setPatMRNo(String patMRNo) {
		this.patMRNo = patMRNo;
	}

	public String getPatFirstName() {
		return patFirstName;
	}

	public void setPatFirstName(String patFirstName) {
		this.patFirstName = patFirstName;
	}

	public String getPatLastName() {
		return patLastName;
	}

	public void setPatLastName(String patLastName) {
		this.patLastName = patLastName;
	}


}
