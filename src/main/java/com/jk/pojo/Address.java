/** 
 * <pre>项目名称:springboot-consumer 
 * 文件名称:Address.java 
 * 包名:com.jk.pojo 
 * 创建日期:2018年11月13日下午7:23:34 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.io.Serializable;

/** 
 * <pre>项目名称：springboot-consumer    
 * 类名称：Address    
 * 类描述：    
 * 创建人：张家玮
 * 创建时间：2018年11月13日 下午7:23:34    
 * 修改人：张家玮   
 * 修改时间：2018年11月13日 下午7:23:34    
 * 修改备注：       
 * @version </pre>    
 */
public class Address implements Serializable{

	private Integer addressid;
	
	private String addressname;

	public Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}

	public String getAddressname() {
		return addressname;
	}

	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}
	
	
}
