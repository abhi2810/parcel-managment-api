package com.example.parcel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcel.model.Parcel;

@Service
public class ParcelService {

	@Autowired
	private ParcelRepository parcelRepository;
	
	public List<Parcel> getParcel(){
		List<Parcel> tempList = new ArrayList<>();
		parcelRepository.findAll().forEach(tempList::add);//java 8 lambda .foreach(collection::method)
		return tempList;
	}
	
	public Parcel getParcel(int id) {
		return parcelRepository.findById(id).get();
	}
	
	public List<Parcel> getParcel(String param, String value) {
		if(param.equals("isFrom"))
			return parcelRepository.findByIsFrom(Integer.parseInt(value));
		else if(param.equals("goingTo"))
			return parcelRepository.findByGoingTo(Integer.parseInt(value));
		else if(param.equals("createdBy"))
			return parcelRepository.findByCreatedBy(Integer.parseInt(value));
		else
			return parcelRepository.findByCreatedOn(value);
	}
	
	public void addParcel(Parcel parcel) {
		parcelRepository.save(parcel);
	}
	
	public void deleteParcel(int id) {
		parcelRepository.deleteById(id);
	}
	
	public void updateParcel(Parcel parcel) {
		addParcel(parcel);
	}
}
