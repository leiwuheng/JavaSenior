package com.atguigu.team.service;
/**
 * 
 * @Description 自定义异常类
 * @author 
 * @version
 * @date 2020年9月22日下午5:18:37
 */
public class TeamException extends Exception{

	
	private static final long serialVersionUID = 1123454L;

	public TeamException() {
		super();
	}
	
	public TeamException(String msg) {
		super(msg);
	}
	
}
