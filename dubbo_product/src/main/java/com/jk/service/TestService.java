package com.jk.service;

import java.util.List;

import com.jk.model.Drug;
import com.jk.model.Tree;

public interface TestService {

	public	List<Drug> selDrug(Drug d, Integer start, Integer pageSize);
	public int selDrugCount();
	//查询之前的修改
	public Drug toUpdateDrug(String id);
	//修改药品
	public void updateProForm(Drug drug);

	List<Tree> selTreeList1(Integer id);
}
