<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.javalec.guestbook.vo.GuestBookVO"%>
<%@page import="java.util.List"%>
<%@page import="com.javalec.guestbook.dao.GuestBookDAO"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>

<table width='500'>
<form action="getguestbooklist.do">
<tr>
<td><h4>**SEARCH**</h4></td>
<td>
<select name ="select">
<option value="name"> 이름  </option>
<option value="content"> 내용 </option>
</select></td> 
<td><input type="text" name="search"></td>
<td><input type="submit" value="찾기"></td>
<br/>
</tr>
</form>
</table>

	<%
		List<GuestBookVO> list = (List) request.getAttribute("list");
	
		for (GuestBookVO vo : list) {
	%>

	<table border='1px' cellspacing='1' cellpadding='2px' width='500'>
		<tr>
			<td><a href="selectone.do?no=<%=vo.getNo()%>">[<%=vo.getNo()%>]
			 </a>
			</td>
			<td><%=vo.getName()%> </a></td>
			
			<td><%=vo.getReg_date()%></td>

			<th><form action="deleteform.do" method="post">
					<input type="hidden" name="no" value="<%=vo.getNo()%>"> 
					<input type="submit" value="삭제">
				</form></th>

			<th><form action="updatecon.jsp" method="post">
					<input type="hidden" name="no" value="<%=vo.getNo()%>"> 
					<input type="hidden" name="name" value="<%=vo.getName()%>"> 
					<input type="hidden" name="password" value="<%=vo.getPassword()%>">
					<input type="hidden" name="content" value="<%=vo.getContent()%>">
					<input type="submit" value="수정">
				</form></th>
		</tr>

		<tr>
			<td colspan="5"><%=vo.getContent()%> </a></td>

		</tr>
	</table>
	<br />

	<%
		}
	%>


	<form action="addform.do" method="post">
		<table width='500'>
		<tr>
		<td align=right>
		<input type="submit" value="추가">
		</td>
		</tr>
		</table>
		<br />

	</form>
</body>
</html>