package com.naver.myhome1.sample4;

//�������� �̿��Ͽ� Ŭ���� ������ ���ջ��¸� �����ϰ� ����ϴ�.
public class HelloApp_java {
	public static void main(String args[]) {	
		MessageBeanImpl bean=new MessageBeanImpl("Spring");
		bean.setGreeting("�ȳ��ϼ���!");	
		bean.sayHello();
	}
}
