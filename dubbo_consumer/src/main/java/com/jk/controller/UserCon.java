/** 
 * <pre>项目名称:maven_provider 
 * 文件名称:UserCon.java 
 * 包名:com.jk.controller 
 * 创建日期:2018年1月17日下午9:46:00 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jk.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jk.model.Drug;
import com.jk.model.User;
import com.jk.service.TestService;

/** 
 * <pre>项目名称：maven_provider    
 * 类名称：UserCon    
 * 类描述：    
 * 创建人：张萍萍 cht_java@126.com    
 * 创建时间：2018年1月17日 下午9:46:00    
 * 修改人：张萍萍 cht_java@126.com  
 * 修改时间：2018年1月17日 下午9:46:00    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("user")
public class UserCon {
	@Autowired
	TestService testService;
	
	@RequestMapping("selList")
	@ResponseBody
	public Map<String,Object> selList(Integer start,Integer pageSize){
		User user=new User();
		user.setName("123");
		int count=testService.selCountUser2();
		List<User> selList = testService.selList(user,start,pageSize);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("total", count);
		map.put("rows", selList);
		return map;
	}
	@RequestMapping("selDrug")
	@ResponseBody
	public Map<String,Object> selDrug(Integer start,Integer pageSize){
		Drug drug=new Drug();
		int count=testService.selDrugCount();
		List<Drug> selList = testService.selDrug(drug,start,pageSize);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("total", count);
		map.put("rows", selList);
		return map;
	}
	@RequestMapping("toUpdateDrug")
	public ModelAndView toUpdateDrug(String id){
		ModelAndView md=new ModelAndView();
		Drug dc=testService.toUpdateDrug(id);
		md.addObject("d", dc);
		md.setViewName("../proUpdate");
		return md;
	}
	@RequestMapping("toUpdateUser")
	public ModelAndView toUpdateUser(String id){
		ModelAndView md=new ModelAndView();
		User dc=testService.toUpdateUser(id);
		md.addObject("d", dc);
		md.setViewName("../UserUpdate");
		return md;
	}
	//修改药品
	@RequestMapping("updateProForm")
	@ResponseBody
	public void updateProForm(Drug drug){
		testService.updateProForm(drug);
	}
	//修改用户
	@RequestMapping("updateUserForm")
	@ResponseBody
	public void updateUserForm(User user){
		testService.updateUserForm(user);
	}
	@RequestMapping("selTreeList")
	@ResponseBody
	public List<Tree>  selTreeList(){
		//查询父节点
		List<Tree> list=testService.selTreeList1(0);
		//将查询出来的父节点 当作条件 再查询子节点
		List<Tree> listSel =selChild(list);
		return listSel;

	}


	//查询子节点
	public List<Tree> selChild(List<Tree> list) {
		//定义一个新的集合 用来装查询出来的数据
		List<Tree> childList=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Tree trees = list.get(i);

			//将父节点的id当作条件查询 因为子节点的pid等于父节点的id
			List<Tree> listQ=testService.selTreeList1(trees.getId());
			//判断子节点下是否还有子节点
			if(listQ.size()>0){
				List<Tree> selChild = selChild(listQ);
				trees.setNodes(selChild);
				childList.add(trees);
			}else{
				childList.add(trees);
			}
		}
		return childList;
	}

}
