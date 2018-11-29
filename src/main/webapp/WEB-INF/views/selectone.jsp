<%@page import="com.javalec.guestbook.vo.GuestBookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		GuestBookVO vo = (GuestBookVO) request.getAttribute("vo");
		request.getParameter("no");
	%>

	<table border='1px' cellspacing='1' cellpadding='2px' width='500'>
		<tr>
			<td>[<%=vo.getNo()%>]
		<input type="hidden" name="no" value="<%=vo.getNo()%>"> 
			</td>
			<td><%=vo.getName()%></td>
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
			<td colspan="5"><%=vo.getContent()%></td>

		</tr>
	</table>
	<br />




</body>
</html>