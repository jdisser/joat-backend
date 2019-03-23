package com.altocirrusapps.apps.joatbackend.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	protected long id;

	@OneToOne(mappedBy = "eventEntity")
	protected CalEvent calEvent;
	
	@Enumerated(EnumType.STRING)
	protected EventType type;
	
	public CalEntity() {
		
	}

	public CalEvent getCalEvent() {
		return calEvent;
	}

	public void setCalEvent(CalEvent calEvent) {
		this.calEvent = calEvent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}
	
	
	
	
	
}
