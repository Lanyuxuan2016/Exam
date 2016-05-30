package com.atguigu.surveypark.util;

public class App {

	public static void main(String[] args) throws Exception {
		for(int i = 0 ; i < 64 ; i ++){
			System.out.println("1<<" + i + "="+ (1l << i));
		}
	}
}
