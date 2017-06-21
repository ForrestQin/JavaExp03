package org.crazyit.app.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import org.crazyit.app.service.*;
import org.crazyit.app.service.impl.*;
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
public class MyBeanPostProcessor
	implements BeanPostProcessor
{
	/**
	 * �������е�Beanʵ�����к���
	 * @param bean ��Ҫ���к�����ԭBeanʵ��
	 * @param beanName ��Ҫ���к�����Bean������id
	 * @return ���غ�����ɺ��Bean
	 */
	public Object postProcessBeforeInitialization
		(Object bean , String beanName)
	{
		System.out.println("Bean�������ڳ�ʼ��֮ǰ��"
			+ beanName + "������ǿ����..."+"������ѧ����201588888888");
		// ���صĴ������Beanʵ������ʵ������������ʵ��ʹ�õ�Bean
		// ��Beanʵ����������ԭBean��Ȼ��ͬ
		return bean;
	}
	public Object postProcessAfterInitialization
		(Object bean , String beanName)
	{
		System.out.println("Bean�������ڳ�ʼ��֮���"
			+ beanName + "������ǿ����..."+"������ѧ����201588888888");
		// �����Bean��Chinese���ʵ��
		if (bean instanceof Chinese)
		{
			// �޸���name��Ա����
			Chinese c = (Chinese)bean;
			c.setName("���iOS����");
		}
		return bean;
	}
}