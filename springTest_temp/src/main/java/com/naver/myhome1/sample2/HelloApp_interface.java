package com.naver.myhome1.sample2;
/*
 * ������ �̿��ϱ�
 * �������̽��� �̿��Ͽ� Ŭ���� ������ ���� ���踦 ���ϰ� �����ϰ� �ֽ��ϴ�.
 * MessageBean �������̽��� ����� �޴� �ν��Ͻ����� �ݵ�� sayHello()�޼��带 �������̵� �ϵ��� �� �ξ��� ������
 * �������̽� MessageBean���� ������ ���۷��� ������ �����ؼ� �޼��带 ȣ���� ��쿡�� �ڵ带 �������� �ʾƵ� �˴ϴ�.
 * ������ MessageBeanKo Ŭ������ MessageBeanEn Ŭ������ �����ؾ��� ��� 24����ó�� �����ؾ� �մϴ�.
 * ��, �����ϴ� ��ü�� �����ϸ� �˴ϴ�.
 * ����  ����� ���ø����̼��� ��� �ν��Ͻ� ������ ���� ������ �ϰ� �ִٸ� ������ �ڵ��� �絵 �������� �˴ϴ�.
 */
public class HelloApp_interface {
	public static void main(String args[]) {	
		MessageBeanKo bean = new MessageBeanKo();
		bean.sayHello("ȫ�浿");	
		
		/*
		 	MessageBean bean = new MessageBeanEn();
		 */
	}
}
