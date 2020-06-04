package com.qianfeng.test;

import java.util.Random;

import com.qianfeng.entity.Ake;
import com.qianfeng.entity.YaSe;

public class StartGame {
	public static void main(String[] args){
		//需要什么设什么
		YaSe yaSe = new YaSe();
		yaSe.setName("亚瑟");
		yaSe.setAttackNumber(200);
		yaSe.setAtttackNumber(2000);
		
		Ake ake = new Ake();
		ake.setName("阿轲");
		ake.setAttackNumber(400);
		ake.setAttackNumber(1000);
		
		while(true){
			int temp = new Random().nextInt(2);
			if(temp == 0){
				// 亚瑟打阿轲
				yaSe.attack(ake);
				if(ake.getBooldNumber() <=0){
					yaSe.successDESC();
					return;
				}
			}
			if(temp == 1){
				ake.attack(yaSe);
				if(yaSe.getBooldNumber() <= 0){
					ake.successDESC();
					return;
				}
			}
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
