package com.mine.bean;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:06
 */
public interface UserService {

	User createUser(String firstName, String lastName, int age);

	User queryUser();
}
