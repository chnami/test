package com.naver.myhome1.sample1;
/*
 * �� ���α׷��� �ڹٿ��� �Ϲ������� �� �� �ִ� �ڵ��Դϴ�.
 * HelloAppŬ�������� MessageBeanEnŬ������ ���� �ν��Ͻ��� �����Ͽ� say�޼��带 ȣ���ϰ� �ֽ��ϴ�.
 * �̷� ��츦 HelloAppŬ������ MessageBeanEn Ŭ������ ���ϰ� �����ϰ� �ִٰ� �մϴ�.
	==> �� Ŭ������ �ٸ� Ŭ������ �޼��带 ������ ���� �����Ѵٶ�� �մϴ�.
	��, Ŭ�������� ��������, ���ջ��°� ���ϴٰ� �� �� �ֽ��ϴ�.
 */
/*
 * ���� HelloAppŬ�������� MessageBeanEn Ŭ���� ��� �ٸ� Ŭ���� (MessageBeanKo)�� ����� ��쿡
 	(MessageBeanKoŬ������ MessageBeanEnŬ������ ���� ����� �����ϴ� �޼��尡 �����մϴ�.)
 	�� �۷����� �޼���� MessageBeanEnŬ������ �޼���� �ٸ� �̸����� ���ǰ� �ս��ϴ�.
 	�׷��� MessageBeanKoŬ������ �����ϱ� ���ؼ��� �Ʒ���  27-28���� ó�� �ڵ带 �����ؾ��մϴ�.
 * �̸� �ذ��ϱ� ���� �켱 �̸��� ���� �޼��带 ����ϴ� ���(������ �̿�)���� ����� ���ڽ��ϴ�.
 */
public class HelloApp {
	public static void main(String args[]) {	
		MessageBeanEn bean = new MessageBeanEn();
		bean.say("Spring");	
		
		MessageBeanKo bean2 = new MessageBeanKo();
		bean2.sayHello("Spring");

	}
}
