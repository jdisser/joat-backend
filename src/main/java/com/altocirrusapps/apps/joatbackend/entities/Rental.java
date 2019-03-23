package com.altocirrusapps.apps.joatbackend.entities;

import javax.persistence.Entity;

@Entity
public class Rental extends CalEvent {
	
	private int guests;
	
	private String notes;

	public Rental(int guests, String notes) {
		super();
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
