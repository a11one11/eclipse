package cn.bhu.edu.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import cn.bhu.edu.domain.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student stud=new Student(); stud.setXh("1001"); stud.setUserName("Mike");
		 * stud.setAge(22);
		 */
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stud1=(Student) context.getBean("stud");
		Student stud2=(Student) context.getBean("stud");
		stud1.setAge(12);
		
			System.out.println(stud1);
			System.out.println("----");
		
			System.out.println(stud2.getAge());
					
			
	}

}
