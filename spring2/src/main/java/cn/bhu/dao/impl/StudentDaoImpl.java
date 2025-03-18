package cn.bhu.dao.impl;

import cn.bhu.dao.StudentDao;
import cn.bhu.domain.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void insertStud(Student stud) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getStudNameById(String id) {
		
		return "战士"+id;
	}

}
