package com.altocirrusapps.apps.joatbackend.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Position {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	private float latDeg;
	@NotBlank
	private float latMin;
	@NotBlank
	private float lonDeg;
	@NotBlank
	private float lonMin;
	
	
	@OneToOne( mappedBy = "position",
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Address address;
	
	public Position(long id, @NotBlank float latDeg, @NotBlank float latMin, @NotBlank float lonDeg,
			@NotBlank float lonMin, Address address) {
		this.id = id;
		this.latDeg = latDeg;
		this.latMin = latMin;
		this.lonDeg = lonDeg;
		this.lonMin = lonMin;
		this.address = address;
	}
	
	public Position() {
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getLatDeg() {
		return latDeg;
	}
	public void setLatDeg(float latDeg) {
		this.latDeg = latDeg;
	}
	public float getLatMin() {
		return latMin;
	}
	public void setLatMin(float latMin) {
		this.latMin = latMin;
	}
	public float getLonDeg() {
		return lonDeg;
	}
	public void setLonDeg(float lonDeg) {
		this.lonDeg = lonDeg;
	}
	public float getLonMin() {
		return lonMin;
	}
	public void setLonMin(float lonMin) {
		this.lonMin = lonMin;
	}
	
}
