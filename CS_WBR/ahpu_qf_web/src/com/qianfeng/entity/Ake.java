package com.qianfeng.entity;

public class Ake extends Hero {

	public void attack(Hero attackHero) {
		attackHero.setBooldNumber(attackHero.getBooldNumber()
				- this.getAttackNumber());
		System.out.println(getName() + "发起了进攻，并且对" + attackHero.getName()
				+ "造成了" + this.getAttackNumber() + "总伤害！"
				+ attackHero.getName() + "剩余血量为" + attackHero.getBooldNumber());
	}
	
	public void successDESC(){
		System.out.println("小心你的背后");
	}

}