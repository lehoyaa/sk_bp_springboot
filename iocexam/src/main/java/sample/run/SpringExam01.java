package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.MyBean;

public class SpringExam01 {

	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
		System.out.println("ApplicationContext 생성후!!");
		
		
		MyBean bean1 =(MyBean)context.getBean("myBean");
		
		bean1.setName("kang");
		
		System.out.println(bean1.getName());
		
		MyBean bean2 = context.getBean("myBean2",MyBean.class);
		
		System.out.println(bean2.getName());
		
		if(bean1 == bean2)
			System.out.println("bean1과 bea2는 같은 인스턴스입니다.");
		else
			System.out.println("bean1과 bea2는 다른 인스턴스입니다.");
		
		MyBean bean3 = context.getBean("myBean2",MyBean.class);
		
		
		if(bean3 == bean2)
			System.out.println("bean3과 bea2는 같은 인스턴스입니다.");
		else
			System.out.println("bean3과 bea2는 다른 인스턴스입니다.");
		
//		Book book = context.getBean("book");
//		book.setTitle();
//		System.out.println(book.getTitle());
	}

}
