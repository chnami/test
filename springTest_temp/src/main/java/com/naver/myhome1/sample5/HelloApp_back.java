package com.naver.myhome1.sample5;

import org.springframework.context.support.GenericXmlApplicationContext;

//스프링을 이용하여 클래스 사이의 결합상태를 느슨하게 만듭니다.
public class HelloApp_back {
	public static void main(String args[]) {	
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("com/naver/myhome1/sample5/applicationContext.xml");
		//Object getBean(String name) : argument로 지정된 이름의 bean 인스턴스를 반환합니다.
		//applicationContext.xml에서 id가 "m3"인 bean을 가져옵니다.
		MessageBean bean=(MessageBean)ctx.getBean("m3");
		System.out.println("=====getBean 후=====");
		bean.sayHello();			
		System.out.println("=====sayHello 후====HelloApp.java=");
		ctx.close();
		//자동 새로 고침
		//Window>Preferences>General
		//		>Workspace>Refresh using native hooks and pooling
	}
}
