package com.qianfeng.entity;

//��ɪ��һ��Ӣ�ۣ��̳���һ��������� is a (�����Ǹ���)�Ĺ�ϵ
//ΪʲôҪʹ�ü̳���������Ϊ����Ҫͨ���̳�ʵ���ļ��Ķ�̬
public class YaSe extends Hero {
	
	private String name;
	//������
	private int atttackNumber;
	//Ѫ��
	private int booldNumber;
	
	public YaSe(){
		
	}
	
	public YaSe(String args) {
		name = args;
	}
	
	public void attack(){
		System.out.println("��ɪ�����˽���");
	}
	
	public void defence(){
		System.out.println(""+ name + "�����˷���");
	}

	public void attack(Hero attackHero) {
		attackHero.setBooldNumber(attackHero.getBooldNumber()
				- this.getAttackNumber());
		System.out.println(getName() + "�����˽��������Ҷ�" + attackHero.getName()
				+ "�����" + this.getAttackNumber() + "���˺���"
				+ attackHero.getName() + "ʣ��Ѫ��Ϊ" + attackHero.getBooldNumber());
	}
	
	public void successDESC(){
		System.out.println("�������У����߲����赲!");
	}

	
	//Ϊ˽����������get,set����
	//ʹ�ÿ�ݼ� alt+shift+s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtttackNumber() {
		return atttackNumber;
	}

	public void setAtttackNumber(int atttackNumber) {
		this.atttackNumber = atttackNumber;
	}

	public int getBooldNumber() {
		return booldNumber;
	}

	public void setBooldNumber(int booldNumber) {
		this.booldNumber = booldNumber;
	}
	
    
	
}
