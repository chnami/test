package com.naver.myhome1.sample9;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Properties {
	public static void main(String args[]) {	
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("com/naver/myhome1/sample9/applicationContext.xml");
		CollectionBean bean = (CollectionBean)ctx.getBean("collectionBean");
		
		Properties addressList = bean.getAddressList();
		
		System.out.println(addressList.getProperty("�ּ�"));
		System.out.println(addressList.getProperty("����"));
		
		//Properties���� ���� Ű������ �����ɴϴ�.
		Set<String> keys=addressList.stringPropertyNames();
		
		for(String key : keys) {
			System.out.println(key+":"+addressList.get(key));
		}
		ctx.close();
	}
}
