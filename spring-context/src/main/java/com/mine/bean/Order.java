package com.mine.bean;
/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-22
 * @time: 15:04
 */
public class Order {

	private String name;

	private String product;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Order{" +
				"name='" + name + '\'' +
				", product='" + product + '\'' +
				", age=" + age +
				'}';
	}
}
