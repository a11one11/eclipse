package cn.bhu.dao;

import cn.bhu.domain.Student;

public interface StudentDao {
	public void insertStud(Student stud);
	public String getStudNameById(String id);

}
