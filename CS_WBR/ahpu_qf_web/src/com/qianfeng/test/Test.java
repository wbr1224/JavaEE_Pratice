package com.qianfeng.test;

import com.qianfeng.entity.YaSe;

public class Test {
	public static void main(String args[]){
		// 静态函数不需要实例化，可以直接使用
		// public static void main是ava底层虚拟机只认这个是应用程序入口
		// 只是基于CS端的程序才需要程序的入口
		// String [] args （字符串）这个是打开方式
		
		// 静态方法，直接类名使用
		// 只适合封装这种固化行为
		//YaSe.denfence();
		// 普通函数，适用于 封装这种 可变行为
		//YaSe yaSe = new YaSe();
		// 亚瑟的attack会随着亚瑟的实例化
		//yaSe.attack();
		System.out.println(giveYourMoney());
	}
	
	// 学会函数，只需要了解三点
	// 1:返回值的问题 （新手容易翻车） -------抽象到现实生活中 就是 我们做事情 其实都有目的
	// 2:声明函数 是 使用函数    ----------抽象到现实生活中 就是 我们会做的事情 只有做了才有意义
	// 3.形式 和 实参的使用    ------------ 抽象到现实生活中 就是 我们的整合一个行为 如果过需要具象化 就需要 参数的帮助
	// 如果一个函数 前面有修饰符合返回值 并且有方法体 那么这个函数 就是一个声明式函数
	// 一个声明式如果不被调用 那么这个函数 本身是没有具体意义的
	public void giveMoney() {
		// 非静态函数必须要实例化
	}
	
	public  static String giveYourMoney() {
		
		return "谢谢";
	}
	// 使用函数非常容易犯的一个错，就是函数的返回值不会处理
	// 消化返回值有两种方式
	//	(1) 通过复制运算符（=）
	//	(2) 也可以通过实参来消化
	// attention:
	// 因为编程中要小心（），体现在何种地方呢？
	// 就是这个（）这行代码 究竟怎么才算写完
	// 其实一行代码具体些多长 完全取决于该函数的返回值，如果有返回值，代码就长一点点
	// 否则就短一点点
	// 代码要以代码短为标准
	// 只要我们写的代码够短，那么久证明我们的代码 可维护性高 可扩展性越高
	// 所以说代码 越短越好
	// 阿里巴巴明确规范 一行代码不能超过80字符
}
