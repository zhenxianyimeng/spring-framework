package com.mine;

import com.mine.service.WelcomeService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-09-14
 * @time: 19:33
 */
public class Entrance {
	public static void main(String[] args) {
		System.out.println("11");
		String xmlPath = "/Users/zjb/code/mine/commit/spring-framework/test-mine/src/main/resources/spring/spring-config.xml";
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService)applicationContext.getBean("welcomeService");

	}
}
