/** 
 * <pre>项目名称:maven_dubboSpringBootConsumer 
 * 文件名称:Drug.java 
 * 包名:com.jk.model 
 * 创建日期:2018年1月18日下午8:50:14 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven_dubboSpringBootConsumer    
 * 类名称：Drug    
 * 类描述：    
 * 创建人：张萍萍 cht_java@126.com    
 * 创建时间：2018年1月18日 下午8:50:14    
 * 修改人：张萍萍 cht_java@126.com  
 * 修改时间：2018年1月18日 下午8:50:14    
 * 修改备注：       
 * @version </pre>    
 */
public class Drug implements Serializable{
	
	private static final long serialVersionUID = 2073708677647699845L;
	private Integer drugId;
	private String drugName;
	private Integer drugPrice;
	private String drugBrand;
	private String drugType;
	public Integer getDrugId() {
		return drugId;
	}
	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public Integer getDrugPrice() {
		return drugPrice;
	}
	public void setDrugPrice(Integer drugPrice) {
		this.drugPrice = drugPrice;
	}
	public String getDrugBrand() {
		return drugBrand;
	}
	public void setDrugBrand(String drugBrand) {
		this.drugBrand = drugBrand;
	}
	public String getDrugType() {
		return drugType;
	}
	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "Drug [drugId=" + drugId + ", drugName=" + drugName + ", drugPrice=" + drugPrice + ", drugBrand="
				+ drugBrand + ", drugType=" + drugType + "]";
	}
	
	
	

}
