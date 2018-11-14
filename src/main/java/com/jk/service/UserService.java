/** 
 * <pre>项目名称:springboot-consumer 
 * 文件名称:UserService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年11月13日下午5:02:25 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.HashMap;
import java.util.List;

import com.jk.pojo.Address;
import com.jk.pojo.Tree;
import com.jk.pojo.User;

/** 
 * <pre>项目名称：springboot-consumer    
 * 类名称：UserService    
 * 类描述：    
 * 创建人：张家玮
 * 创建时间：2018年11月13日 下午5:02:25    
 * 修改人：张家玮   
 * 修改时间：2018年11月13日 下午5:02:25    
 * 修改备注：       
 * @version </pre>    
 */
public interface UserService {

	/** <pre>queryTree(这里用一句话描述这个方法的作用)   
	 * 创建人：张家玮
	 * 创建时间：2018年11月13日 下午6:59:12    
	 * 修改人：张家玮      
	 * 修改时间：2018年11月13日 下午6:59:12    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Tree> queryTree();

	/** <pre>queryAddress(这里用一句话描述这个方法的作用)   
	 * 创建人：张家玮
	 * 创建时间：2018年11月13日 下午7:36:38    
	 * 修改人：张家玮      
	 * 修改时间：2018年11月13日 下午7:36:38    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Address> queryAddress();

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：张家玮
	 * 创建时间：2018年11月13日 下午7:40:37    
	 * 修改人：张家玮      
	 * 修改时间：2018年11月13日 下午7:40:37    
	 * 修改备注： 
	 * @param user 
	 * @param start 
	 * @param pageSize 
	 * @return</pre>    
	 */
	HashMap<String, Object> queryUser(Integer pageSize, Integer start, User user);

	/** <pre>deleteUser(这里用一句话描述这个方法的作用)   
	 * 创建人：张家玮
	 * 创建时间：2018年11月13日 下午10:34:49    
	 * 修改人：张家玮      
	 * 修改时间：2018年11月13日 下午10:34:49    
	 * 修改备注： 
	 * @param id</pre>    
	 */
	void deleteUser(String id);

	/** <pre>queryUserById(这里用一句话描述这个方法的作用)   
	 * 创建人：张家玮
	 * 创建时间：2018年11月13日 下午10:38:02    
	 * 修改人：张家玮      
	 * 修改时间：2018年11月13日 下午10:38:02    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	User queryUserById(String id);

	/** <pre>saveOrUpdate(这里用一句话描述这个方法的作用)   
	 * 创建人：张家玮
	 * 创建时间：2018年11月13日 下午10:47:41    
	 * 修改人：张家玮      
	 * 修改时间：2018年11月13日 下午10:47:41    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void saveOrUpdate(User user);

}
