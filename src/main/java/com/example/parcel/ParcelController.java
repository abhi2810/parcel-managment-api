package com.example.parcel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcel.model.Parcel;

@RestController
public class ParcelController {

	@Autowired
	private ParcelService parcelService;
	
	@RequestMapping("/parcel")
	public List<Parcel> getAllParcel(){
		return parcelService.getParcel();
	}
	
	@RequestMapping("/parcel/{id}")
	public Parcel getParcel(@PathVariable int id) {
		return parcelService.getParcel(id);
	}
	
	@RequestMapping("/parcel/{param}/{value}")
	public List<Parcel> getParcel(@PathVariable String param, @PathVariable String value) {
		return parcelService.getParcel(param,value);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/parcel/id")
	public void addParcel(@RequestBody Parcel parcel) {
		parcelService.addParcel(parcel);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/parcel/id/{id}")
	public void deleteParcel(@PathVariable int id) {
		parcelService.deleteParcel(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/parcel/id")
	public void deleteParcel(@RequestBody Parcel parcel) {
		parcelService.updateParcel(parcel);
	}
	
}
