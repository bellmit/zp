package com.jk.service;

import java.util.List;

import com.jk.model.Drug;
import com.jk.model.Tree;
import com.jk.model.User;

public interface TestService {

	
	public	List<User> selList(User u, Integer start, Integer pageSize);
	
	
	public	List<Drug> selDrug(Drug d, Integer start, Integer pageSize);


	/** <pre>selCountUser(这里用一句话描述这个方法的作用)
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午9:01:52    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午9:01:52    
	 * 修改备注： 
	 * @return</pre>    
	 */
	public int selCountUser2();


	/** <pre>selDrugCount(这里用一句话描述这个方法的作用)
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午9:15:19    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午9:15:19    
	 * 修改备注： 
	 * @return</pre>    
	 */
	public int selDrugCount();


	/** <pre>toUpdateDrug(这里用一句话描述这个方法的作用)
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午10:20:30    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午10:20:30    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	public Drug toUpdateDrug(String id);


	/** <pre>updateProForm(修改产品)
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午10:24:27    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午10:24:27    
	 * 修改备注： 
	 * @param drug</pre>    
	 */
	public void updateProForm(Drug drug);


	/** <pre>toUpdateUser(这里用一句话描述这个方法的作用)
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午10:37:35    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午10:37:35    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	public User toUpdateUser(String id);


	/** <pre>updateUserForm(这里用一句话描述这个方法的作用)
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午10:43:12    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午10:43:12    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	public void updateUserForm(User user);

	List<Tree> selTreeList1(Integer id);
}
