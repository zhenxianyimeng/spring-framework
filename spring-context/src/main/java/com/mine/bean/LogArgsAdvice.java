package com.mine.bean;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:17
 */
public class LogArgsAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("准备执行方法: " + method.getName() + ", 参数列表：" + Arrays.toString(args));
	}
}
