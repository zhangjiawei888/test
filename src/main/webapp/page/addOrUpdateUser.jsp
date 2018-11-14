<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增和修改</title>
<%@ include file="/common/mystyle.jsp" %>
</head>
<body>
	
	<form id="addForm">
		<input type="hidden" value="${user.id}" name="id"/>
		<div class="form-group">
	    <label for="name">姓名</label>
	    <input type="text" class="form-control" name="name"  value="${user.name}" placeholder="请输入..">
	  </div>
	  <div class="form-group">
	    <label for="age">年龄</label>
	    <input type="text" class="form-control" name="age" value="${user.age}" placeholder="请输入..">
	  </div>
	  	
	  	<label for=sex>性别</label>
		<div>
		    <label class="radio-inline">
		        <input type="radio" name="sex" id="optionsRadios3" value="1"
		        <c:if test="${user.sex==1}">checked</c:if> > 男
		    </label>
		    <label class="radio-inline">
		        <input type="radio" name="sex" id="optionsRadios4"  value="2"
		        <c:if test="${user.sex==2}">checked</c:if> > 女
		    </label>
		</div>
	  <div class="form-group">
	    <label for="birthday">生日</label>
	    <input class="form-control"  name="birthday" value="${user.birthday}" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" />
	  </div>
	  <div class="form-group">
    <label for="address">住址</label>
    <select class="form-control" name="address">
      <option value="-1">--请选择--</option>
     <c:forEach items="${addressList}" var="a">
			<option value="${a.addressid}" ${a.addressid==user.address?"selected":"" } >${a.addressname}</option>
	</c:forEach>
    </select>
  </div>
	  
	</form>

</body>
</html>