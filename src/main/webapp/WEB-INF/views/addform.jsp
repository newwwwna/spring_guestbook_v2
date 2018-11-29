<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add.do" method="post">
		<input type="hidden" name="a" value="add">
		<table border='1px' cellspacing='1' cellpadding='2px' width='500'> 
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="4"><textarea name="content" rows="10" cols="50"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4" align=right><input type="submit" value="확인">
				</td>
			</tr>
		</table>
		<br />

	</form>
<a href="getguestbooklist.do">목록으로 돌아가기</a>

</body>
</html>