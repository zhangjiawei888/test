/** 
 * <pre>项目名称:event-maven 
 * 文件名称:Tree.java 
 * 包名:com.jk.pojo 
 * 创建日期:2018年10月18日上午9:27:39 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

/** 
 * <pre>项目名称：event-maven    
 * 类名称：Tree    
 * 类描述：    
 * 创建人：张家玮
 * 创建时间：2018年10月18日 上午9:27:39    
 * 修改人：张家玮   
 * 修改时间：2018年10月18日 上午9:27:39    
 * 修改备注：       
 * @version </pre>    
 */
public class Tree implements Serializable{

	private String id;
	
	private String text;
	
	private String url;
	
	private Integer pid;
	
	private List<Tree> nodes;
	
	/**
	 * 表示能否被选中
	 * */
	private Boolean selectable;
	
	/**
	 *	表示是否为子节点 
	 * */
	private Boolean leaf;
	
	

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public List<Tree> getNodes() {
		return nodes;
	}

	public void setNodes(List<Tree> nodes) {
		this.nodes = nodes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	
	
}
