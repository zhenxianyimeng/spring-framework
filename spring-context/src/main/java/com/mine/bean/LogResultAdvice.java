package com.mine.bean;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:17
 */
public class LogResultAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName() + "方法返回：" + returnValue);
	}
}
