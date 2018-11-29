<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATEFORM</title>
</head>
<body>
<%String no = request.getParameter("no");%>
<%String name = request.getParameter("name");%>
<%String password = request.getParameter("password");%>
<%String content = (String) request.getParameter("content");%>

<form action="updatecon.do" method="post">


<input type="hidden" name="no" value="<%= no %>">
<input type="hidden" name="name" value="<%= name %>">
<input type="hidden" name="password" value="<%= password %>">
<input type="hidden" name="content" value="<%= content %>">

<table>
<tr>
<td> 비밀번호 </td>
<td> <input type = "password" name ="pw" > </td>

<td> <input type="submit" value="수정"> </td>

<td> <a href ="getguestbooklist.do"> 메인으로 돌아가기</a></td>
</tr>
</table>

</form>

</body>
</html>