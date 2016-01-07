<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>spring+mybatis+mysql添加员工</h1>
	<form action="${pageContext.request.contextPath }/emp/addEmp.action" method="post">
		<table border="1" width="30%">
			<tr>
				<td>姓名:</td>
				<td>
					<input type="text" name="name"/>
				</td>
			</tr>
			<tr>
				<td>薪水:</td>
				<td>
					<input type="text" name="sal"/>
				</td>
			</tr>
			<tr>
				<td>性别:</td>
				<td>
					<input type="radio" name="sex" value="男" checked/>男
					<input type="radio" name="sex" value="女"/>女
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="添加" style="width:150px;"/>
				</td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>