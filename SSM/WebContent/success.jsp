<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
				hello,${sessionScope.user.uname }<a href="zhuce.jsp">添加新用户</a>
				<table>
				<c:forEach items="${a }" var ="user" >
				<tr><td>
				${user.uname }
				</td>
				<td>
				${user.upwd }
				</td>
				<td>
				${user.rid }
				</td>
				<td><a href="updateaa?uid=${user.uid }">修改</a></td>
				<td><a href="delete?uid=${user.uid }">删除</a></td>
				</tr>
				
				</c:forEach>
				</table>
				当前页[${dqy }/${totalPages }]
	
	<c:if test="${dqy > 1 }">
	<a href="fenye?dqy=1">首页</a>
	<a href="fenye?dqy=${dqy-1 }">上一页</a>
	</c:if >
	<c:if  test="${dqy < totalPages }">
	<a href="fenye?dqy=${dqy+1 }">下一页</a>
	<a href="fenye?dqy=${totalPages }">末页</a>
	</c:if >
	
				
</body>
</html>