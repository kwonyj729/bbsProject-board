<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 페이지</title>

<style>
.table-1 {
	width: 30%;
	border: 1px solid #333333;
	border-collapse: collapse;
	text-align: center;
}

td, th {
	padding: 5px;
	border: 1px solid #333333;
}
</style>
</head>
<body>
	<h3>글쓰기 페이지</h3>

	<form action="input" method="post">
		<table class="table-1">
			<tr>
				<td colspan="2" align="center">제목</td>
				<td><input type="text" name="title" style="width:300px;" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">내용</td>
				<td><textarea rows="5" cols="40" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">작성자</td>
				<td><input type="text" name="writer" style="width:300px;" /></td>
			</tr>
			<tr>
				<td colspan="5" align="center">
					<input type="submit" value="저장" /> 
					<input type="reset" value="초기화" /> 
					<input type="button" value="목록보기" onclick="location.href='list'" />
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>