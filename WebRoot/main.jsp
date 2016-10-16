<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>main.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
   	<table border="1">
   		<!-- 标题 -->
   		<tr>
   			<th>姓名</th>
   			<th>性别</th>
   			<th>爱好</th>
   			<th>操作</th>
   		</tr>
   		<c:forEach items="${student}" var="s">
	   		<tr>	
	   			<td>${s.name}</td>
	   			<td>${s.sex}</td>
	   			<td>${s.hobby}</td>
	   			<td><a href="${pageContext.request.contextPath}/student/delete.do?id=${s.id}">删除</a></td>
	   		</tr>
   		</c:forEach>
   		
   	</table>
  </body>
</html>
