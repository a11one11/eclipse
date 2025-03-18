package cn.bhu.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bhu.domain.Student;
import cn.bhu.service.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
   Student stud=(Student) context.getBean("student");
  // System.out.println(stud);
   //StudManager studmanger=new StudManagerImpl();
   
   StudManager studmanger=(StudManager) context.getBean("studManagerImpl");
   
   System.out.println(studmanger.getStudName("1001"));
   
	}

}
