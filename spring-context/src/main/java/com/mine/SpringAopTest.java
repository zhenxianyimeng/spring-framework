package com.mine;

import com.mine.bean.OrderService;
import com.mine.bean.User;
import com.mine.bean.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:27
 */
public class SpringAopTest {
	public static void main(String[] args) {
		// 启动 Spring 的 IOC 容器
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:mine-advice.xml");

		UserService userService = context.getBean(UserService.class);
		OrderService orderService = context.getBean(OrderService.class);
		User user = context.getBean("user", User.class);

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();

		orderService.createOrder("Leo", "随便买点什么");
		orderService.queryOrder("Leo");
	}
}
