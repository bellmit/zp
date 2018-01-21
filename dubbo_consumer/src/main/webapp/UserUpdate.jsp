<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/js/fileinput/css/fileinput.min.css" />
<!-- 引入fileinput的js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/fileinput/js/fileinput.min.js"></script>
<!--  引入fileinput的js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/fileinput/js/locales/zh.js"></script>
<!-- 引入fileinput的css -->
<form id="updateForm">
			<input type="hidden"   name="userid"  value="${d.userid}">
		
		  <div class="form-group">
		    <label for="proName">名字</label>
		    <input type="text" class="form-control" value="${d.name}"  name="name"  id="proName" placeholder="产品名称">
		  </div>
		<div class="form-group">
		    <label for="exampleInputPassword1">用户简介</label>
		    <input type="text" name="userinfo" value="${d.userinfo}" class="form-control" placeholder="价格" />
		  </div>
		 <div class="form-group">
		    <label for="proName">用户地址</label>
		    <input type="text" class="form-control" value="${d.useraddress}"  name="useraddress"  id="proName" placeholder="地址">
		  </div>
		
  
		  <div class="form-group">
		    <label for="proType">用户类型</label>
		    <select  name="sex" id="proType" class="form-control">
			  <option value="1" ${d.sex==1?"selected":""}>个人</option>
			  <option value="2" ${d.sex==2?"selected":""}>家庭</option>
			  <option value="3" ${d.sex==3?"selected":""}>公用</option>
			</select>
		  </div>
		</form>
		
	

    