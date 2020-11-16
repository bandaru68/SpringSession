package com.Example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Example.model.InsuranceData;
import com.Example.repository.InsuranceRepository;

@Service
public class InsuranceDao {

	@Autowired
	InsuranceRepository insurancerepository;
	public void insertData(InsuranceData studentObj) {
		insurancerepository.save(studentObj);
	}
	
	public void deleteRecord(int id) {
		insurancerepository.deleteById(id);
	}
	
	public List<InsuranceData> displayAll(){
		List<InsuranceData> studentList = (List<InsuranceData>) insurancerepository.findAll();
		return studentList;
	}
	public void updateRecord(int policyno,String name) {
		InsuranceData i=insurancerepository.findById(policyno).get();
		i.setName(name);
		insurancerepository.save(i);
		
	}
	
}
