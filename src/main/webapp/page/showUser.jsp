<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>
<%@ include file="/common/mystyle.jsp" %>
</head>
<body>

		<!-- <form  id="addForm" method="post" class="form-inline" >
			  <div class="form-group">
			    <label for="carName">汽车名称</label>
			    <input type="text" class="form-control"  name="carName" style="width: 200px" id="carName" placeholder="请输入..">
			  </div>
			  <div class="form-group">
			    <label for="minPrice">汽车价格</label>
			    <input type="text" class="form-control" style="width: 200px" name="minPrice" id="minPrice" placeholder="请输入..">
			  	
			  	<input type="text" class="form-control" name="maxPrice" id="maxPrice" style="width: 200px" placeholder="请输入..">
			  </div> 
			 <button type="button" class="btn btn-success" onclick="search()">搜索</button>
			 <button type="button" class="btn btn-info" onclick="reset()">刷新</button>
		</form> -->


		<button type="button" class="btn btn-warning" onclick="addUser()">添加</button>
		<table id="userTable"></table>


	
</body>

		<script type="text/javascript">
	
		/* function reset(){
			location.href=location;
		}
		
		function search(){
			$("#userTable").bootstrapTable('refresh',{
					query:{
						"carName":$("#carName").val(),
						 "maxPrice":$("#maxPrice").val(),
						 "minPrice":$("#minPrice").val()
					}
				})
		} */
		
		$().ready(function (){

			$("#userTable").bootstrapTable({
				url:"<%=request.getContextPath()%>/user/queryUser.do",
				striped:true,
				singleSelect:true,
				clickToSelect:true,
				uniqueId:"id",
				showColumns:true,
				pagination:true,
				pageNumber:1,
				pageSize:3,
				pageList:[3,5,8,12],
				sidePagination:'server',
				contentType:'application/x-www-form-urlencoded;charset=UTF-8',
				toolbar:'#tabToolBar',
				columns:[
				         {
				        	 field:'id',
				        	 title:'编号',
				        	 width:100,
				        	 align:'center',
				         },
				         {
				        	 field:'name',
				        	 title:'姓名',
				        	 width:100,
				        	 align:'center'
				         },
				         {
				        	 field:'age',
				        	 title:'年龄',
				        	 width:100,
				        	 align:'center'
				         },
				         {
				        	 field:'sex',
				        	 title:'性别',
				        	 width:100,
				        	 align:'center',
				        	 formatter:function (value,row,index){
				        		 return value==1?'男':(value==2?'女':'');
				        	 }
				         },
				         {
				        	 field:'birthday',
				        	 title:'生日',
				        	 width:100,
				        	 align:'center'
				         },
				         {
				        	 field:'addressName',
				        	 title:'住址',
				        	 width:100,
				        	 align:'center',
				        	 
				         },
				         {
				        	 field:'handle',
				        	 title:'操作',
				        	 width:100,
				        	 align:'center',
				        	 formatter:function(value,row,index){
				        		 return "<button type='button' class='btn btn-info' onclick=\"deleteUser(\'"+row.id+"\')\" >删除 </button>"+
				        		 "<button type='button' class='btn btn-info' onclick=\"updateUser(\'"+row.id+"\')\" >编辑 </button>"	;
									
				        	 }
				         }
				         ],
				         
				         queryParams:function (params){
				        	 var whereParams = {
				        		 "pageSize":params.limit,
								 "start":params.offset,
								 
				        	 }
								return whereParams;
							},
				
			})
		})
		
		
		
	
		function deleteUser(id){
			$.ajax({
				url:"<%=request.getContextPath()%>/user/deleteUser.do",
				data:{id:id},
				success:function (){
					bootbox.alert("删除成功");
					location.href=location;
				}
			})
		}
		
		
		function addUser(){
			dialog('<%=request.getContextPath()%>/user/toAddUser.do','<%=request.getContextPath()%>/user/saveOrUpdate.do','添加用户信息');
		}
		
		function dialog(htmlUrl,submitUrl,title){
			var dialog = bootbox.dialog({
				title:title,
				message:getJspHtml(htmlUrl),
				buttons:{
					"save":{
						label:'保存',
						className:"btn-success",
						callback:function(){
							$.ajax({
								url:submitUrl,
								type:"post",
								data:$("#addForm").serialize(),
								success:function (data){
									bootbox.alert("添加成功");
								location.href=location;
								},
								error:function(){
									bootbox.alert("添加失败");
								}
							})
						}
					},
					"unSave":{
						label:'取消',
						className:'btn-info',
						callback:function(){
							
						}
					}
				}
			})	
		}
		
		
		function getJspHtml(urlStr){
			var jspHtml = "";
			$.ajax({
				url:urlStr,
				type:"post",
				async:false,
				success:function (data){
					jspHtml = data;
				},
				error:function (){
					bootbox.alert("失败");
				}
			})
			return jspHtml;
		} 
		
	
		function updateUser(id){
			dialog('<%=request.getContextPath()%>/user/queryUserById.do?id='+id,'<%=request.getContextPath()%>/user/saveOrUpdate.do','编辑用户信息');
		} 
		
	</script>


</html>