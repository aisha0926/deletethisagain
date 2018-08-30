package com.QA.SpringBootDBApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.SpringBootDBApp.model.MySpringBootDataModel;

@Repository
public interface DBAppRepository extends JpaRepository<MySpringBootDataModel, Long>{

}
