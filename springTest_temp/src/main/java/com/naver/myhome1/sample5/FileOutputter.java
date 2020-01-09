package com.naver.myhome1.sample5;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter{
	private String filePath;	//������� ��ο� �����̸��� ������ ����
	
	public FileOutputter() {
		System.out.println("����� FileOutpuuter �������Դϴ�.");
	}

	@Override
	public void output(String message) throws IOException {
		System.out.println("����� FileOutpuuter.java�� output() �Դϴ�.");
		FileWriter out = new FileWriter(filePath);
		out.write(message);//�޽����� �����
		out.close();//��� ��ü(����)�� ����
		
	}
	public void setFilePath(String filePath) {
		this.filePath=filePath;	//out.txt ���ԵǾ����ϴ�.
		System.out.println("����� FileOuputter.java�� setFilePath() �Դϴ�.");
	}	//���������� setter �޼��带 Ȱ���� setter DI ����
	
}
