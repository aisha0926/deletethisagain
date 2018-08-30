package com.QA.SpringBootDBApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.SpringBootDBApp.model.BorrowerModel;

@Repository
public interface UserRepository extends JpaRepository<BorrowerModel, Long> {

}
