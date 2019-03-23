package com.altocirrusapps.apps.joatbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(mappedBy = "eventEntity")
	private CalEvent calEvent;
	
	public CalEntity() {
		
	}

	public CalEvent getCalEvent() {
		return calEvent;
	}

	public void setCalEvent(CalEvent calEvent) {
		this.calEvent = calEvent;
	}
	
	
	
	
}
