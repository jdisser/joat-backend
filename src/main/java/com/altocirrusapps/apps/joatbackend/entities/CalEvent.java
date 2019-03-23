package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CalEvent implements CalSchedulable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String recType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eventPid")
	private CalEvent recEvent;
	
	@OneToMany(mappedBy = "recEvent")
	private Set<CalEvent> recEventEdits;
	
	
	private long eventLength;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime changeDate;
	
	@Enumerated(EnumType.STRING)
	protected EventType type;
	
	

	public CalEvent() {
	
	}

	public CalEvent(String description, LocalDateTime startDate, LocalDateTime endDate, String recType, long eventPid,
			long eventLength, LocalDateTime createdDate, LocalDateTime changeDate, EventType type) {

		this.recEventEdits = new HashSet<CalEvent>();
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.recType = recType;
		this.eventLength = eventLength;
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

	public String getRecType() {
		return recType;
	}

	public void setRecType(String recType) {
		this.recType = recType;
	}

	
	public void setRecEvent(CalEvent ce) {
		this.recEvent = ce;
	}
	
	public CalEvent getRecEvent() {
		return this.recEvent;
	}
	
	public Set<CalEvent> getRecEventEdits() {
		return recEventEdits;
	}

	public void setRecEventEdits(Set<CalEvent> recEventEdits) {
		this.recEventEdits = recEventEdits;
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
	
	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}
	
	public boolean isOccuring(LocalDate date) {
		//TODO: code to implement parsing and calculating from rec_type
		return true;
	}
	public boolean isBetween(LocalDateTime from, LocalDateTime to) {
		//TODO: code to implement parsing and calculating from rec_type
		return true;
	}
	public LocalDateTime nextOccurance(LocalDateTime after) {
		//TODO: code to implement parsing and calculating from rec_type
		return LocalDateTime.now();
	}
	
	
}
