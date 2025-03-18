package cn.bhu.service;
import cn.bhu.dao.*;
import cn.bhu.dao.impl.*;

public class StudManagerImpl implements StudManager {
	private StudentDao studDao;	

	@Override
	public String getStudName(String id) {	
		 //studDao=new StudentDaoImpl();
		
		String name=studDao.getStudNameById(id);
		return name;
	}

	public void setStudDao(StudentDao studDao) {
		this.studDao = studDao;
	}

}
