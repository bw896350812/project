<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>编号</td>
		<td>店铺名称</td>
		<td>开业日期</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${shopList }" var="shop">
	
	<tr>
		<td>${shop.sid }</td>
		<td>${shop.sname }</td>
		<td>${shop.sdate }</td>
		<td>操作</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>