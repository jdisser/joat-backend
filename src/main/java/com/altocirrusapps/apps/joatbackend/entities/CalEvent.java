package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class CalEvent {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String recType;
	
	private long eventPid;
	
	private long eventLength;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime changeDate;
	
	
	

	public CalEvent() {
	
	}

	public CalEvent(String description, LocalDateTime startDate, LocalDateTime endDate, String recType, long eventPid,
			long eventLength, LocalDateTime createdDate, LocalDateTime changeDate) {
		super();
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.recType = recType;
		this.eventPid = eventPid;
		this.eventLength = eventLength;
		this.createdDate = createdDate;
		this.changeDate = changeDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getRecType() {
		return recType;
	}

	public void setRecType(String recType) {
		this.recType = recType;
	}

	public long getEventPid() {
		return eventPid;
	}

	public void setEventPid(long eventPid) {
		this.eventPid = eventPid;
	}

	public long getEventLength() {
		return eventLength;
	}

	public void setEventLength(long eventLength) {
		this.eventLength = eventLength;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(LocalDateTime changeDate) {
		this.changeDate = changeDate;
	}
	
	
}
