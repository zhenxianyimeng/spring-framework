package com.service.impl;

import com.service.WelcomeService;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-09-13
 * @time: 23:13
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
