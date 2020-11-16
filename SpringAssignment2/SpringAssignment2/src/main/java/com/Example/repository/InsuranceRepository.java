package com.Example.repository;

import org.springframework.data.repository.CrudRepository;

import com.Example.model.InsuranceData;

public interface InsuranceRepository extends CrudRepository<InsuranceData,Integer>{

}
