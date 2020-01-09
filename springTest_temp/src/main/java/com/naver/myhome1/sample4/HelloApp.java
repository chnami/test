package com.naver.myhome1.sample4;

import org.springframework.context.support.GenericXmlApplicationContext;

//�������� �̿��Ͽ� Ŭ���� ������ ���ջ��¸� �����ϰ� ����ϴ�.
public class HelloApp {
	public static void main(String args[]) {	
		/*
		 * Spring �����̳� ���� ȯ�� ���� ������ applicationContext.xml�� �ε��Ͽ� ������ �����̳� �� �ϳ���
		 * GenericXmlApplicationContext ��ü�� �����Ǿ� ������ �����̳ʰ� �����մϴ�.
		 * ������ �����̳ʴ� applicationContext.xml�� ������� ���� �����մϴ�.
		 */
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("com/naver/myhome1/sample4/applicationContext.xml");
		
		MessageBean bean=(MessageBean)ctx.getBean("m2");
		bean.sayHello();	
		ctx.close();
	}
}
