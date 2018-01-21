<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/js/fileinput/css/fileinput.min.css" />
<!-- 引入fileinput的js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/fileinput/js/fileinput.min.js"></script>
<!--  引入fileinput的js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/fileinput/js/locales/zh.js"></script>
<!-- 引入fileinput的css -->
<form id="updateForm">
			<input type="hidden"   name="drugId"  value="${d.drugId}">
		
		  <div class="form-group">
		    <label for="proName">药品名称</label>
		    <input type="text" class="form-control" value="${d.drugName}"  name="drugName"  id="proName" placeholder="产品名称">
		  </div>
		<div class="form-group">
		    <label for="exampleInputPassword1">药品价格</label>
		    <input type="number" name="drugPrice" value="${d.drugPrice}" class="form-control" placeholder="价格" />
		  </div>
		 <div class="form-group">
		    <label for="proName">生产公司</label>
		    <input type="text" class="form-control" value="${d.drugBrand}"  name="drugBrand"  id="proName" placeholder="产品名称">
		  </div>
		
  
		  <div class="form-group">
		    <label for="proType">药品类型</label>
		    <select  name="drugType" id="proType" class="form-control">
			  <option value="1" ${d.drugType==1?"selected":""}>中药</option>
			  <option value="2" ${d.drugType==2?"selected":""}>西药</option>
			  <option value="3" ${d.drugType==3?"selected":""}>中西结合</option>
			</select>
		  </div>
		</form>
		
	

    