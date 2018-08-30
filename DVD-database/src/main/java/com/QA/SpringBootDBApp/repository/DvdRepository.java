package com.QA.SpringBootDBApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.SpringBootDBApp.model.DvdModel;

@Repository
public interface DvdRepository extends JpaRepository<DvdModel, Long>{
	Page<DvdModel> findById(Long dvd_id, Pageable pageable); 
}