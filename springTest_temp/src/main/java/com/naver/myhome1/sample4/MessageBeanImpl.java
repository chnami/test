package com.naver.myhome1.sample4;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	
	//������ ȣ���� ���Ͽ� name="Spring" �Ҵ��մϴ�.
	
	public MessageBeanImpl(String name) {
		this.name=name;
	}//������ ����

	@Override
	public void sayHello() {
		System.out.println(greeting+name+"!");		
	}
	public String getGreeting() {
		return greeting;
	}
	//setGreeting�޼ҵ� ȣ���� ���Ͽ� greeting="�ȳ��ϼ���!" �Ҵ��մϴ�.
	public void setGreeting(String greeting) {
		this.greeting=greeting;
	}
	
}
