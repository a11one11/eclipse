package cn.bhu.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student", Student.class);
        student.setSname("高宇");
        student.setSno("003");
        student.setSgender("男");

        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.myPrintln(student.toString());
    }
}