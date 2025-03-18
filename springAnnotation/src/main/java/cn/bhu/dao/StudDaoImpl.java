package cn.bhu.dao;

import org.springframework.stereotype.Repository;
import cn.bhu.domain.Student;

@Repository
public class StudDaoImpl implements IStudDao {
    @Override
    public void insert(Student student) {
        System.out.println("insert student: " + student);
    }

    @Override
    public void update(Student student) {
        System.out.println("update student: " + student);
    }

    @Override
    public void delete(String id) {
        System.out.println("delete student id: " + id);
    }
}