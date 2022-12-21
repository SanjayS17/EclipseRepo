package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public  abstract class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updateddate;
	
	public AbstractAuditDTO() {
		System.out.println("calling noarg const of abstractionauditDTO");
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String localTime) {
		this.createdBy = localTime;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	

}
