<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
					<form  action="update"  method="post">
					<input type="hidden" name="uid" value="${li.uid}">
							name:<input type="text"  name="uname"  value="${li.uname }">
							pwd:<input type="text"  name="upwd" value="${li.upwd }">
							rid:<input type="text"  name="rid" value="${li.rid }">
							<input type="submit"  value="sub">
					</form>
</body>
</html>