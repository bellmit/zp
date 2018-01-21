/** 
 * <pre>项目名称:maven_provider 
 * 文件名称:UserMapper.java 
 * 包名:com.jk.mapper 
 * 创建日期:2018年1月17日下午9:35:40 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.mapper;

import java.util.List;

import com.jk.model.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.model.Drug;
import com.jk.model.User;

/** 
 * <pre>项目名称：maven_provider    
 * 类名称：UserMapper    
 * 类描述：    
 * 创建人：张萍萍 cht_java@126.com    
 * 创建时间：2018年1月17日 下午9:35:40    
 * 修改人：张萍萍 cht_java@126.com  
 * 修改时间：2018年1月17日 下午9:35:40    
 * 修改备注：       
 * @version </pre>    
 */
@Mapper
public interface UserMapper {

	@Select("select drug_id as drugId,drug_name as drugName,"
			+ " drug_price as drugPrice,"
			+ " drug_brand as drugBrand,"
			+ " drug_type as drugType"
			+ " from t_drug limit #{start},#{pageSize}")
	List<Drug> selDrug(@Param("d") Drug d, @Param("start") Integer start, @Param("pageSize") Integer pageSize);

	/** <pre>selDrugCount(这里用一句话描述这个方法的作用)   
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午9:17:47    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午9:17:47    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@Select("select count(1) from t_drug")
	int selDrugCount();

	@Select("select drug_id as drugId,drug_name as drugName,"
			+ " drug_price as drugPrice,"
			+ " drug_brand as drugBrand,"
			+ " drug_type as drugType"
			+ " from t_drug where drug_id=#{id}")
	Drug toUpdateDrug(@Param("id") String id);

	/** <pre>updateProForm(这里用一句话描述这个方法的作用)   
	 * 创建人：张萍萍 cht_java@126.com     
	 * 创建时间：2018年1月18日 下午10:25:34    
	 * 修改人：张萍萍 cht_java@126.com      
	 * 修改时间：2018年1月18日 下午10:25:34    
	 * 修改备注： 
	 * @param drug</pre>    
	 */
	@Update("update t_drug set"
			+ " drug_name = #{drugName},"
			+ " drug_price = #{drugPrice},"
			+ " drug_brand = #{drugBrand},"
			+ " drug_type = #{drugType}"
			+ " where drug_id = #{drugId}")
	void updateProForm(Drug drug);
	@Select("select id,text,url,pid"
			+ " from tress where pid=#{id}")
    List<Tree> selectByPrimaryKey(Integer id);
}
