package com.naver.myhome1.sample2_2;

public class MessageBeanEn implements MessageBean {
	//추상 메서드 오버라이딩
	public void sayHello(String name) {
		System.out.println("Hello!"+name);
	}
}
