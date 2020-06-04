package com.qianfeng.test;

import java.util.Random;
import com.qianfeng.entity.YaSe;
import com.qianfeng.entity.Ake;

public class StratGame {
	public static void main(String[] args){
		YaSe yase = new YaSe();
		yase.setName("ÑÇÉª");
		yase.setAttackNumber(100);
		yase.setBooldNumber(2000);
		
		Ake ake = new Ake();
		ake.setName("°¢çæ");
		ake.setAttackNumber(200);
		ake.setBooldNumber(1000);
		
		while(true){
			int temp = new Random().nextInt(2);
			
			if(temp==0){
				yase.attack(ake);
				if (ake.getBooldNumber() <=0){
					yase.successDESC();
					return;
					}
			}
			
			if(temp==1){
				ake.attack(yase);
				if (yase.getBooldNumber() <=0){
					ake.successDESC();
					return;
				}
			}
			
		}
		
	}
}