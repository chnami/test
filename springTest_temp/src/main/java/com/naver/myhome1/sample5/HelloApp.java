package com.naver.myhome1.sample5;

//�������� �̿��Ͽ� Ŭ���� ������ ���ջ��¸� �����ϰ� ����ϴ�.
public class HelloApp {
	public static void main(String args[]) {	
		//MessageBeanimpl ��ü ����
		//FileOutputter ��ü ����
		//FileOutputter ��ü�� setFilePath() ȣ��
		//MessageBeanImpl ��ü�� setGreeting() ȣ��
		//MessageBeanImpl ��ü�� setOuputter() ȣ��
		//MessageBeanImpl ��ü�� sayHello() ȣ��
		
		MessageBeanImpl bean = new MessageBeanImpl("Spring");
		FileOutputter outputter = new FileOutputter();
		outputter.setFilePath("out.txt");
		bean.setGreeting("�ȳ��ϼ���~!");
		bean.setOutputter(outputter);
		bean.sayHello();
	}
}
