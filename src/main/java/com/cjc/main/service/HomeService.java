package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService 
{

	void saveUser(Student stu);

	void loginCheck(String un, String ps);

	Iterable<Student> displayAll();

	void deleteData(int id);

	Student editData(int id);

}
