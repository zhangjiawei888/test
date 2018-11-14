/** 
 * <pre>项目名称:springboot-consumer 
 * 文件名称:UserController.java 
 * 包名:com.jk.controller 
 * 创建日期:2018年11月13日下午5:01:32 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.pojo.Address;
import com.jk.pojo.Tree;
import com.jk.pojo.User;
import com.jk.service.UserService;

import redis.clients.jedis.ShardedJedisPool;

/** 
 * <pre>项目名称：springboot-consumer    
 * 类名称：UserController    
 * 类描述：    
 * 创建人：张家玮
 * 创建时间：2018年11月13日 下午5:01:32    
 * 修改人：张家玮   
 * 修改时间：2018年11月13日 下午5:01:32    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("queryTree")
	@ResponseBody
	public List<Tree> queryTree(){
		List<Tree> list = userService.queryTree();
		return list;
		
	}
	
	@RequestMapping(value="/toQueryUser")
	public String toQueryUser(Model model){
		List<Address> addressList = userService.queryAddress();
		model.addAttribute("addressList", addressList);
		return "page/showUser";
	}
	
	@RequestMapping("queryUser")
	@ResponseBody
	public HashMap<String,Object> queryUser(Integer pageSize,Integer start,User user){
		HashMap<String,Object> userList = userService.queryUser(pageSize,start,user);
		return userList;
		
	}
	
	@RequestMapping("deleteUser")
	@ResponseBody
	public void deleteUser (String id){
		userService.deleteUser(id);
	}
	
	
	@RequestMapping(value="/queryUserById")
	public String queryUserById(String id,Model model){
		List<Address> addressList = userService.queryAddress();
		model.addAttribute("addressList", addressList);
		User user = userService.queryUserById(id);
		model.addAttribute("user", user);
		return "page/addOrUpdateUser";
		
	}
	
	@RequestMapping("saveOrUpdate")
	@ResponseBody
	public void saveOrUpdate(User user){
		userService.saveOrUpdate(user);
	}
	
	@RequestMapping(value="/toAddUser")
	public String toAddUser(Model model){
		List<Address> addressList = userService.queryAddress();
		model.addAttribute("addressList", addressList);
		return "page/addOrUpdateUser";
		
	}
	
}
