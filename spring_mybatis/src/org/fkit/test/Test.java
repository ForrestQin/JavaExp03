package org.fkit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.fkit.domain.*;
import org.hibernate.Session;
import org.mybatis.spring.support.SqlSessionDaoSupport;  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.context.support.ClassPathXmlApplicationContext; 
import org.apache.ibatis.session.SqlSession;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Test  extends SqlSessionDaoSupport
{
	 public static void main(String[] args) {  
		  // TODO Auto-generated method stub  
		  new Test().firstTest();  
		 }  
		 public void firstTest() {  
		  BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");  
		  Test test = (Test)factory.getBean("userTest");  

//		  System.out.println("正在插入数据.........");
//		  test.getSqlSession().insert("org.fkit.domain.User.saveUser",
//				  new User("201562651482", "Qin.Sir","2015 Electronic Commerce Class 2"));
		  
		  System.out.println("开始查找数据.........");
		  System.out.println((User)test.getSqlSession().selectOne("selectUser",1)); 
		  
		  System.out.println("开始修改数据.........");
		  User us = (User)test.getSqlSession().selectOne("selectUser",1);  
		  us.setName("王二");
		  us.setSclass("2015电子商务1班");
		  us.setSid("201588888888");
		  test.getSqlSession().update("org.fkit.domain.User.modifyUser", us);
		  
		  System.out.println("开始删除数据.........");
		  us = (User)test.getSqlSession().selectOne("selectUser",1);  
		  test.getSqlSession().delete("org.fkit.domain.User.removeUser", us);
		 }  
}