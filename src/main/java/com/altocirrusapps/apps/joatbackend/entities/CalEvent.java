package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CalEvent {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime changeDate;
	
	@Enumerated(EnumType.STRING)
	protected EventType type;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "propertyid")
	private Property property;
	
	

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
