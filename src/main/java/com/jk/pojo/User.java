/** 
 * <pre>项目名称:springboot-consumer 
 * 文件名称:User.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月13日下午4:57:17 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.io.Serializable;

/** 
 * <pre>项目名称：springboot-consumer    
 * 类名称：User    
 * 类描述：    
 * 创建人：张家玮
 * 创建时间：2018年11月13日 下午4:57:17    
 * 修改人：张家玮   
 * 修改时间：2018年11月13日 下午4:57:17    
 * 修改备注：       
 * @version </pre>    
 */
public class User implements Serializable{

	private String id;
	
	private String name;
	
	private Integer sex;
	
	private Integer age;
	
	private String birthday;
	
	private String address;
	
	private String addressName;

	
	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
