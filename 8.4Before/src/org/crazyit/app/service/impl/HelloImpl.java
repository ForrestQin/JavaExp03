package org.crazyit.app.service.impl;

import org.springframework.stereotype.Component;

import org.crazyit.app.service.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Component("hello")
public class HelloImpl implements Hello
{
	// ����һ���򵥷�����ģ��Ӧ���е�ҵ���߼�����
	public void foo()
	{
		System.out.println("ִ��Hello�����foo()����");
	}
	// ����һ��addUser()������ģ��Ӧ���е������û��ķ���
	public int addUser(String name , String pass)
	{
		System.out.println("ִ��Hello�����addUser�����û���" + name+"  "+pass);
		return 20;
	}
}