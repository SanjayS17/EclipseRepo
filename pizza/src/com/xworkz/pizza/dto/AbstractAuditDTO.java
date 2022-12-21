package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

public class AbstractAuditDTO {
	private  String createdBy;
	private  LocalDateTime createdDate;
	private  String UpdatedBy;
	private  LocalDateTime UpdatedDate;
	
	
	public AbstractAuditDTO() {
		super();
	}


	public AbstractAuditDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		UpdatedBy = updatedBy;
		UpdatedDate = updatedDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}


	public String getUpdatedBy() {
		return UpdatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}


	public LocalDateTime getUpdatedDate() {
		return UpdatedDate;
	}


	public void setUpdatedDate(LocalDateTime updatedDate) {
		UpdatedDate = updatedDate;
	}
	
	
	
	
	

}
