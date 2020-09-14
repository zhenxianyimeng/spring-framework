package com.mine.bean;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:10
 */
public class OrderServiceImpl implements OrderService {

	@Override
	public Order createOrder(String username, String product) {
		Order order = new Order();
		order.setName(username);
		order.setProduct(product);
		return order;
	}

	@Override
	public Order queryOrder(String username) {
		Order order = new Order();
		order.setName("test");
		order.setProduct("test");
		return order;
	}
}
