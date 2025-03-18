package cn.bhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.bhu.dao.StudDaoImpl;
import cn.bhu.domain.Student;

@Service
public class StudServiceImpl implements IStudService {
    @Autowired
    private StudDaoImpl studDao;

    @Override
    public void addStudent(Student student) {
        studDao.insert(student);
    }

    @Override
    public void removeStudent(String id) {
        studDao.delete(id);
    }
}