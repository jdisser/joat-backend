package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDateTime;



import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/*
 * Example of PrimaryKeyJoin Column
 * https://docs.jboss.org/hibernate/orm/5.1/userguide/html_single/chapters/domain/inheritance.html
 * 
 */


@Entity
@Table(name = "rental")
@PrimaryKeyJoinColumn(name = "calevent_id")
public class Rental extends CalEvent {
	
	private int guests;
	
	private String name;
	private String phone;
	
	private String notes;
	
	@ManyToOne
	@JoinColumn(name="schedule_id", nullable=false)
	private Schedule schedule;

	public Rental(String description, LocalDateTime startDate, LocalDateTime endDate, 
			LocalDateTime createdDate, LocalDateTime changeDate, EventType type, int guests, String notes) {
		
		super(description, startDate, endDate, createdDate, changeDate, type);
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	

	
}
