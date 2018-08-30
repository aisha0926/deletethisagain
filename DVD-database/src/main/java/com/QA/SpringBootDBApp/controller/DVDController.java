package com.QA.SpringBootDBApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QA.SpringBootDBApp.exception.ResourceNotFoundException;
import com.QA.SpringBootDBApp.model.BorrowerModel;
import com.QA.SpringBootDBApp.model.DvdModel;
import com.QA.SpringBootDBApp.repository.DvdRepository;
import com.QA.SpringBootDBApp.repository.UserRepository;

@RestController
@RequestMapping("/")
public class DVDController {
	
	@Autowired
	DvdRepository dvdRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/dvd/orders/{user_id}")
	public Page<DvdModel> getAllRentByUserId(@PathVariable (value="user_id") Long userId, Pageable pageable){
		return dvdRepo.findById(userId, pageable);
	}
	
	@PostMapping("/dvd")
	public DvdModel createPerson(@Valid @RequestBody DvdModel dvdMoodel) {
		return dvdRepo.save(dvdMoodel);
	}
	
	@GetMapping("dvd/{id}")
	public DvdModel getDVDbyID(@PathVariable(value="id")Long dvdID) {
		return dvdRepo.findById(dvdID).orElseThrow(()-> new ResourceNotFoundException("MySpringBootDataModel", "id", dvdID));
	}
	
	@GetMapping("/dvd")
	public List<DvdModel> getAllDVD(){
		return dvdRepo.findAll();
	}
	
	@PutMapping("/dvd/{id}")
	public DvdModel updateDvd(@PathVariable(value="id") Long dvdID, @Valid @RequestBody DvdModel dvdDetails) {
		DvdModel mSDM = dvdRepo.findById(dvdID).orElseThrow(()-> new ResourceNotFoundException("DVD", "id", dvdID));
		mSDM.setDvdName(dvdDetails.getDvdName());
		mSDM.setDateBorrowed(dvdDetails.getDateBorrowed());
	
		DvdModel updateData = dvdRepo.save(mSDM);
		return updateData;
	}
	
	@PostMapping("/user")
	public BorrowerModel createPerson(@Valid @RequestBody BorrowerModel dvdMoodel) {
		return userRepo.save(dvdMoodel);
	}
	
	@GetMapping("user/{id}")
	public BorrowerModel getPersonbyID(@PathVariable(value="id")Long user_id) {
		return userRepo.findById(user_id).orElseThrow(()-> new ResourceNotFoundException("MySpringBootDataModel", "id", user_id));
	}
	
	@GetMapping("/user")
	public List<BorrowerModel> getAllPeople(){
		return userRepo.findAll();
	}

	@PutMapping("/user/{id}")
	public BorrowerModel updateUser(@PathVariable(value="id") Long user_id, @Valid @RequestBody BorrowerModel userDetails) {
		BorrowerModel mSDM = userRepo.findById(user_id).orElseThrow(()-> new ResourceNotFoundException("User", "id", user_id));
		mSDM.setBorrowerName(userDetails.getBorrowerName());
		mSDM.setBorrowerAddress(userDetails.getBorrowerAddress());
	
		BorrowerModel updateData = userRepo.save(mSDM);
		return updateData;
	}
}
