package com.qianfeng.entity;

public class Ake extends Hero {

	public void attack(Hero attackHero) {
		attackHero.setBooldNumber(attackHero.getBooldNumber()
				- this.getAttackNumber());
		System.out.println(getName() + "�����˽��������Ҷ�" + attackHero.getName()
				+ "�����" + this.getAttackNumber() + "���˺���"
				+ attackHero.getName() + "ʣ��Ѫ��Ϊ" + attackHero.getBooldNumber());
	}
	
	public void successDESC(){
		System.out.println("С����ı���");
	}

}