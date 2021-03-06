package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


/*
 * 
 * This class is inherited using the joined method per
 * https://thoughts-on-java.org/complete-guide-inheritance-strategies-jpa-hibernate/
 * 
 */


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CalEvent {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	@Column(name = "startdate")
	private LocalDateTime startDate;
	
	@Column(name = "enddate")
	private LocalDateTime endDate;
	
	@Column(name = "createddate")
	private LocalDateTime createdDate;
	
	@Column(name = "changedate")
	private LocalDateTime changeDate;
	
	@Enumerated(EnumType.STRING)
	private EventType type;

	
	

	public CalEvent() {
	
	}

	public CalEvent(String description, LocalDateTime startDate, LocalDateTime endDate,
			LocalDateTime createdDate, LocalDateTime changeDate, EventType type) {

		
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdDate = createdDate;
		this.changeDate = changeDate;
		this.type = type;
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
	
	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	
	
}
