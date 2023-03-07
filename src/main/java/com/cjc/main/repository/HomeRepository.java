package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>
{
	public void findAllByUnameAndPassword(String un,String ps);

	public Student findById(int id);
	
	//public void findByUid(int uid); use custom methods when we used uid in the place of id
	
}
