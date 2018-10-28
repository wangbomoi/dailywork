package com.test;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloService;
import beans.ObjectFactory;
import beans.ObjectFactoryBean;
public class TestBeans01 {
	private ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		//初始化spring的IOC容器
		ctx = new ClassPathXmlApplicationContext(
		"spring-configs.xml");
	}
	/***
	 * 思考:
	 * 1)HelloService对象何时创建?(由配置决定)
	 * 2)HelloService对象如何创建的?(反射机制)
	 * 2.1)Class.forName("bean.HelloService")
	 * 2.2)Constructor
	 * 2.3)newInstance(...)
	 * 3)HelloService对象存在哪里了?(Map)
	 */
	@Test
	public void testSayHello(){
		//从Spring IOC容器中获取bean对象
		HelloService helloService=
		ctx.getBean("helloService",//key
		HelloService.class);
		//执行对象的sayHello方法
		helloService.sayHello();
	}
	@Test
	public void testCalendar(){
		Calendar c=
		ctx.getBean("calendar",
		Calendar.class);
	    System.out.println(c);
	}
	@Test
	public void testDate(){
		Date d=
		ctx.getBean("date",Date.class);
		System.out.println(d);
	}
	
	@Test
	public void testObjectFactory(){
		ObjectFactory of1=
		ctx.getBean("objectFactory",
				ObjectFactory.class);
		System.out.println(of1);
		/*ObjectFactory of2=
				ctx.getBean("objectFactory",
						ObjectFactory.class);
		System.out.println(of1==of2);*/
	}
	/***
	 * 了解:
	 * 如何获取创建工厂的那个FactoryBean对象?
	 * 在bean 名字前加前缀"&"
	 */
	@Test
	public void testObjectFactoryBean(){
		ObjectFactoryBean of1=
		ctx.getBean("&objectFactory",
				ObjectFactoryBean.class);
		System.out.println(of1);
	}
	
	@After
	public void destory(){
		//销毁容器
		ctx.close();
	}
	
	
}
