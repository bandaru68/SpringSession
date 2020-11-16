package com.Example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Example.dao.InsuranceDao;
import com.Example.model.InsuranceData;

@RestController
public class InsuranceController {
	@Autowired
	InsuranceDao studentDao;
	InsuranceData insuranceData;
	@RequestMapping("/insert")
	public String insertData()
	{
		InsuranceData studentObj=new InsuranceData();
		studentObj.setPolicy(1);
		studentObj.setName("Ashwitha");
		studentObj.setTenure(2);
		studentObj.setAmount(2000);
		
		InsuranceData studentObj2=new InsuranceData();
		studentObj2.setPolicy(10);
		studentObj2.setName("Charishma");
		studentObj2.setTenure(100);
		studentObj2.setAmount(1000);
		
		studentDao.insertData(studentObj);
		studentDao.insertData(studentObj2);
		return "Data inserted succesfully";
				
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteData(@PathVariable("id") int id)
	{
		studentDao.deleteRecord(id);
		return "Record deleted successfully";
	}
	
	@RequestMapping("/displayAll")
	public List<InsuranceData> displayData()
	{
		List<InsuranceData> studentList=studentDao.displayAll();
		return studentList;
	}
	@RequestMapping("/update/{policyno}/{name}")
	public String updateData(@PathVariable("policyno") int id ,@PathVariable("name") String name)
	{
	
		studentDao.updateRecord(id,name);
		return "Record updated successfully";
		
	}
	
	
	

}
