package com.naver.myhome1.sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

//�������� �̿��Ͽ� Ŭ���� ������ ���ջ��¸� �����ϰ� ����ϴ�.
public class HelloApp3 {
	public static void main(String args[]) {	
		/*
		 * Spring �����̳� ���� ȯ�� ���� ������ applicationContext.xml�� �ε��Ͽ� ������ �����̳� �� �ϳ���
		 * GenericXmlApplicationContext ��ü�� �����Ǿ� ������ �����̳ʰ� �����մϴ�.
		 * ������ �����̳ʴ� applicationContext.xml�� ������� ���� �����մϴ�.
		 */
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("com/naver/myhome1/sample3/applicationContext3.xml");
		
		System.out.println("getBean() ȣ�� ��");
		//�����̳ʰ� ������ ��ü(��)�� �˻�(Lookup)�Ͽ� ����ϴ� ����� Dependency Lookup�̶�� �մϴ�.
		MessageBean bean=(MessageBean)ctx.getBean("m");
		System.out.println("getBean() ȣ�� ��");
		bean.sayHello("spring~");	
		MessageBean bean2=(MessageBean)ctx.getBean("m1");
		bean2.sayHello("spring~");	
		ctx.close();
	}
}
