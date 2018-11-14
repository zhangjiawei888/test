<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>供应商</title>
<%@ include file="/common/mystyle.jsp" %>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top">
		<div class="container-fluid">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
				 data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">.......</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<div class="navbar-header">
					<a href="#" id="menu-toggle" class="navbar-brand glyphicon glyphicon-globe">用户管理系统</a>
				</div>	
				
			</div>
	
	</nav>


		<div class="container-fluid">
			<div class="row">
				<div class="col-md-3">
					<div id="treeId"></div>
				</div>
				<div class="col-md-9" >
					<ul id="tabs" class="nav nav-tabs" role="tablist">
				    <li role="presentation" class="active">
				        <a href="#home" aria-controls="home" role="tab" data-toggle="tab">欢迎</a></li>
				</ul>
			  	<!-- 选项卡  内容 -->
				<!-- Tab panes -->
				<div class="tab-content">
				    <div role="tabpanel" style="" class="tab-pane active " id="home"><h1>热烈欢迎</h1></div>
					<button type="button" class="btn btn-info" onclick="location.href='<%=request.getContextPath() %>/user/toQueryUser.do'">查询</button>
				</div> 
				</div>
			</div>
		</div>
	



	<script type="text/javascript">
		$.addtabs({iframeHeight:870});
	
		$(function(){
			$.ajax({
				type:"post",
				url:"<%=request.getContextPath()%>/user/queryTree.do",
				success:function (data){
					$("#treeId").treeview({
						data:data,
						levels:0,
						collapseIcon:'glyphicon glyphicon-chevron-down',
						emptyIcon:'glyphicon glyphicon-minus-sign',
						backColor:'green',
						showCheckbox:true,
						enableLinks:true,
						onNodeSelected:function (event,node){
							if(node.url!=null && ''!=node.url){
								$.addtabs.add({
									id:node.id,
									title:node.text,
									url:"<%=request.getContextPath()%>"+node.url
								})
							}
						}
					})
				},
			})
		})
	</script>




</body>
</html>