package com.netmind.buisness;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {
	public boolean add(Student student) {

		StudentDao studentDao = new StudentDao();

		studentDao.add(student);
		throw new UnsupportedOperationException(
				"The file is not implemented yet");
	}

}
