package cn.bhu.dao;

import cn.bhu.domain.Student;

public interface IStudDao {
	public void insert(Student student);
	public void update(Student student);
	public void delete(String id);

}
