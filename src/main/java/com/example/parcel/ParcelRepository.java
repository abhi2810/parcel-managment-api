package com.example.parcel;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.parcel.model.Parcel;

public interface ParcelRepository extends CrudRepository<Parcel, Integer> {
	
	public List<Parcel> findByIsFrom(int isFrom);
	public List<Parcel> findByGoingTo(int goingTo);
	public List<Parcel> findByCreatedBy(int createdBy);
	public List<Parcel> findByCreatedOn(String createdOn);
	
}
