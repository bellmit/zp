package com.jk.service;

import java.util.List;

import com.jk.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.mapper.UserMapper;
import com.jk.model.Drug;
import com.jk.model.User;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	UserMapper UserMapper;
	
	

	
	public List<Drug> selDrug(Drug d, Integer start, Integer pageSize) {
		return UserMapper.selDrug(d,start,pageSize);
	}

	public int selDrugCount() {
		return UserMapper.selDrugCount();
	}

	//修改的查询
	public Drug toUpdateDrug(String id) {
		// TODO Auto-generated method stub
		return UserMapper.toUpdateDrug(id);
	}

	//修改产品
	public void updateProForm(Drug drug) {
		UserMapper.updateProForm(drug);
	}

	public List<Tree> selTreeList1(Integer id) {
		// TODO Auto-generated method stub
		return UserMapper.selectByPrimaryKey(id);
	}
	
	

}
