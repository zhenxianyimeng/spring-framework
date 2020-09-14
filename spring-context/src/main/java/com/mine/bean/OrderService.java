package com.mine.bean;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:04
 */
public interface OrderService {
	Order createOrder(String username, String product);

	Order queryOrder(String username);
}
