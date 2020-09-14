package com.mine.service.impl;

import com.mine.service.WelcomeService;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-09-14
 * @time: 19:36
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
