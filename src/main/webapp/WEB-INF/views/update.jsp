<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기 페이지</title>

<style>
.table-1 {
	width: 30%;
	border: 1px solid #333333;
	border-collapse: collapse;
	text-align: lewft;
}

td, th {
	padding: 5px;
	border: 1px solid #333333;
}
</style>
</head>
<body>
	<h3>게시글 상세보기</h3>

	<form action="update" method="post">

		<%-- 	<input type="hidden" name="bno" value="${board.bno}"/> --%>

		<table class="table-1">
			<tr>
				<th colspan="5">글번호</th>
				<td><input type="text" name="bno" style="width:300px;" readonly="readonly" value="${board.bno}"/></td>
			</tr>
			<tr>
				<th colspan="5">제목</th>
				<td><input type="text" name="title" style="width:300px;" value="${board.title}"/></td>
			</tr>
			<tr>
				<th colspan="5">내용</th>
				<td><textarea rows="5" cols="40" name="content" >${board.content}</textarea></td>
			</tr>
			<tr>
				<th colspan="5">작성자</th>
				<td><input type="text" name="writer" style="width:300px;" readonly="readonly" value="${board.writer}" /></td>
			</tr>
			<tr>
				<td colspan="10" align="center">
					<input type="submit" value="수정하기" />  
					<input type="reset" value="초기화" /> 
					<input type="button" value="목록보기" onclick="location.href='list'" />
					<input type="button" value="삭제" onclick="location.href='delete?bno=${board.bno}'" /></td>
			</tr>

		</table>
	</form>
</body>
</html>