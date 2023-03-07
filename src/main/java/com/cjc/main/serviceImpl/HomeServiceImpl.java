package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveUser(Student stu) 
	{
		hr.save(stu);
		
	}

	@Override
	public void loginCheck(String un, String ps) 
	{
		hr.findAllByUnameAndPassword(un, ps);
		
	}

	@Override
	public Iterable<Student> displayAll() 
	{
		
		return hr.findAll();
	}

	@Override
	public void deleteData(int id) 
	{
		hr.deleteById(id);
		
	}

	@Override
	public Student editData(int id) 
	{
		
		return hr.findById(id);
		
	}

}
