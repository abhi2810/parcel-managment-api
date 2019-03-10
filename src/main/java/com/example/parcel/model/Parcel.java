package com.example.parcel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parcel {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	int createdBy;
	String createdOn;
	int isFrom;
	int goingTo;
	boolean isDispatched;
	boolean isDelivered;
	
	public Parcel() {
		
	}
	
	public Parcel(int id, String name, int createdBy, String createdOn, int isFrom, int goingTo, boolean isDispatched,
			boolean isDelivered) {
		super();
		this.id = id;
		this.name = name;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.isFrom = isFrom;
		this.goingTo = goingTo;
		this.isDispatched = isDispatched;
		this.isDelivered = isDelivered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public int getIsFrom() {
		return isFrom;
	}

	public void setIsFrom(int isFrom) {
		this.isFrom = isFrom;
	}

	public int getGoingTo() {
		return goingTo;
	}

	public void setGoingTo(int goingTo) {
		this.goingTo = goingTo;
	}

	public boolean isDispatched() {
		return isDispatched;
	}

	public void setDispatched(boolean isDispatched) {
		this.isDispatched = isDispatched;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	
}
