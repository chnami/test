package com.naver.myhome1.sample5;

import org.springframework.context.support.GenericXmlApplicationContext;

//�������� �̿��Ͽ� Ŭ���� ������ ���ջ��¸� �����ϰ� ����ϴ�.
public class HelloApp_back {
	public static void main(String args[]) {	
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("com/naver/myhome1/sample5/applicationContext.xml");
		//Object getBean(String name) : argument�� ������ �̸��� bean �ν��Ͻ��� ��ȯ�մϴ�.
		//applicationContext.xml���� id�� "m3"�� bean�� �����ɴϴ�.
		MessageBean bean=(MessageBean)ctx.getBean("m3");
		System.out.println("=====getBean ��=====");
		bean.sayHello();			
		System.out.println("=====sayHello ��====HelloApp.java=");
		ctx.close();
		//�ڵ� ���� ��ħ
		//Window>Preferences>General
		//		>Workspace>Refresh using native hooks and pooling
	}
}
