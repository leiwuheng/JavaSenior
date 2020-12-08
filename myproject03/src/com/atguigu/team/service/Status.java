package com.atguigu.team.service;

/**
 * 
 * @Description 表示员工的状态
 * @author
 * @version
 * @date 2020年9月21日下午2:40:49
 */

//public class Status {
//
//	private final String NAME;
//
//	public static final Status FREE = new Status("FREE");
//	public static final Status BUSY = new Status("BUSY");
//	public static final Status VOCATION = new Status("VOCATION");
//
//	private Status(String name) {
//		this.NAME = name;
//	}
//
//	public String getNAME() {
//		return NAME;
//	}
//
//	@Override
//	public String toString() {
//		return NAME;
//	}
//}

public enum Status{
	FREE,BUSY,VOCATION;
}