package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class Rental extends CalEvent {
	
	private int guests;
	
	private String notes;

	public Rental(String description, LocalDateTime startDate, LocalDateTime endDate, String recType, long eventPid,
			long eventLength, LocalDateTime createdDate, LocalDateTime changeDate, EventType type, int guests, String notes) {
		
		super(description, startDate, endDate, recType, eventPid,
				eventLength, createdDate, changeDate, type);
		
		this.guests = guests;
		this.notes = notes;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	
}
