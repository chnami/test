package com.naver.myhome1.sample5;

//스프링을 이용하여 클래스 사이의 결합상태를 느슨하게 만듭니다.
public class HelloApp {
	public static void main(String args[]) {	
		//MessageBeanimpl 객체 생성
		//FileOutputter 객체 생성
		//FileOutputter 객체의 setFilePath() 호출
		//MessageBeanImpl 객체의 setGreeting() 호출
		//MessageBeanImpl 객체의 setOuputter() 호출
		//MessageBeanImpl 객체의 sayHello() 호출
		
		MessageBeanImpl bean = new MessageBeanImpl("Spring");
		FileOutputter outputter = new FileOutputter();
		outputter.setFilePath("out.txt");
		bean.setGreeting("안녕하세유~!");
		bean.setOutputter(outputter);
		bean.sayHello();
	}
}
