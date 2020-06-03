package com.qianfeng.entity;

//亚瑟是一名英雄，继承有一个概念叫做 is a (子类是父类)的关系
//为什么要使用继承这个概念，因为我们要通过继承实现文件的多态
public class YaSe extends Hero {
	
	private String name;
	//攻击力
	private int atttackNumber;
	//血条
	private int booldNumber;
	
	public YaSe(){
		
	}
	
	public YaSe(String args) {
		name = args;
	}
	
	public void attack(){
		System.out.println("亚瑟发起了进攻");
	}
	
	public void defence(){
		System.out.println(""+ name + "发起了防御");
	}

	public void attack(Hero attackHero) {
		attackHero.setBooldNumber(attackHero.getBooldNumber()
				- this.getAttackNumber());
		System.out.println(getName() + "发起了进攻，并且对" + attackHero.getName()
				+ "造成了" + this.getAttackNumber() + "总伤害！"
				+ attackHero.getName() + "剩余血量为" + attackHero.getBooldNumber());
	}
	
	public void successDESC(){
		System.out.println("王者审判，王者不可阻挡!");
	}

	
	//为私有属性设置get,set函数
	//使用快捷键 alt+shift+s
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
