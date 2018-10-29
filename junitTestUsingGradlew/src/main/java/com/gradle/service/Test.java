package com.gradle.service;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		Date today=new Date();
		long ltime=today.getTime()+1*24*60*60*1000;
		Date today1=new Date(ltime);
		System.out.println(today1);
	}

}
