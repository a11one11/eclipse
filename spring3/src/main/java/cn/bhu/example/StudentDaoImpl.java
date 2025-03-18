package cn.bhu.example;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void myPrintln(String str) {
        System.out.println("student:" + str);
    }
}