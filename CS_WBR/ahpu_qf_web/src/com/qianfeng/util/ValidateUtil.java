package com.qianfeng.util;

import java.util.Random;

public class ValidateUtil {
	// ��̬��������Ҫʵ�����Ϳ���ֱ��ʹ��
	// ������ļ���util��������ļ�,��ô���ļ������к��� ��Ӧ�÷��Ϲ����������
	public static String createValideCode(){
		String temp = "1234567890qwertyuiopasdfghjklzxcvbnm";
		// ���һ���ַ�����Ҫƴ�ӵĻ� ������ļ� ���ܻ��һ�� ��Ϊ�������ڶ�ջ��ע���µĵ�ַ
		StringBuilder code = new StringBuilder();
		for(int i=0;i<4;i++){
			code.append(temp.charAt(new Random().nextInt(temp.length())));//�����ַ����ַ����������ض�Ӧ���ַ�
			// ����һ������أ����ص�intֵ��36�ֿ���0~35
			// charAt�����ַ������������ض�Ӧ���ַ�
			// append�������ַ�����stringbullder��ƴ�ӵĺ���
		}
		return code.toString();	
	}
	// ��web�����������ⳡ���ò������߳� ��Ϊtomcat������Ƕ��̱߳��(web�������߳�+�׽���)��tomcat��jeemter��Ŀ�в��������Կ��Դﵽ500��
	// ��С����Ŀ�ǿ���holdס
	// ��java��web���� �����ע�Ĳ����û���������
	// ���ǹ���WEB�����еļ��������ļ� �ֱ���httpservletrequest,httpservletresponse(����������������һ��httpЭ��)
	// httpservletApplication(WEB���������������),httpSession(�û�����������)
	public static void main(String[] args){
		System.out.println(createValideCode());
	}
}
