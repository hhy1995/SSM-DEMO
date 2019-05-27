package com.hhy.service;

import com.hhy.beans.Student;
import com.hhy.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

}
