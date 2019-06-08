package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String recurrence;
	
	private Boolean autoRenew;
	
	private Boolean autoPrompt;
	
	@OneToOne(mappedBy = "schedule_id")
	private Property property;
	
	
	
	@OneToMany(mappedBy="schedule_id")
	private ArrayList<Rental> rentals;
	
	public Schedule() {
		
	}
	
	public Schedule(LocalDateTime startDate, LocalDateTime endDate, String recurrence, Boolean autoRenew,
			Boolean autoPrompt) {

		this.startDate = startDate;
		this.endDate = endDate;
		this.recurrence = recurrence;
		this.autoRenew = autoRenew;
		this.autoPrompt = autoPrompt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	public Boolean getAutoRenew() {
		return autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public Boolean getAutoPrompt() {
		return autoPrompt;
	}

	public void setAutoPrompt(Boolean autoPrompt) {
		this.autoPrompt = autoPrompt;
	}

	
}
