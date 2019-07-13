package com.cmz.pojo;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午5:21:10
 * @description 用于测试的实体类
 */
public class User {

	private String name;
	private Integer age;
	private Boolean sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" + "name=" + name + ", age=" + age + ", sex=" + sex + "}";
	}

}
