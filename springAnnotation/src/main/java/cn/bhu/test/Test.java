package cn.bhu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.bhu.config.SpringConfig;
import cn.bhu.domain.Student;
import cn.bhu.service.StudServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new	AnnotationConfigApplicationContext(SpringConfig.class);
		StudServiceImpl  studService=(StudServiceImpl)context.getBean(StudServiceImpl.class);
		studService.removeStudent("2001");
	}

}
