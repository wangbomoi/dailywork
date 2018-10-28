package com.test;

import org.junit.Test;

import beans.OpenDataSource;

public class TestBeans02 extends TestBase{

	
	@Test
	public void testDataSouce01(){
		OpenDataSource ds1=
		ctx.getBean("dataSource",OpenDataSource.class);
		OpenDataSource ds2=
		ctx.getBean("dataSource",OpenDataSource.class);
		System.out.println(ds1==ds2);
	}
	@Test
	public void testDataSouce02(){
		OpenDataSource ds1=
				ctx.getBean("dataSource",OpenDataSource.class);
		System.out.println(ds1.getDriver());
	}
}
