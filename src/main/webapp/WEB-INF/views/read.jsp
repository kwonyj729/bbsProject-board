<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기 페이지</title>

<style>
.table-1 {
	width: 20%;
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
	<h3>게시글 상세보기</h3>

	<table class="table-1">
		<tr>
			<td>글번호</td>
			<td>${board.bno }</td>	
		</tr>
		<tr>
			<td>제목</td>
			<td>${board.title }</td>	
		</tr>
		<tr>
			<td>작성자</td>
			<td>${board.writer }</td>	
		</tr>
		<tr>
			<td>날짜</td>
			<td>${board.regDate }</td>	
		</tr>
		<tr>
			<td>내용</td>
			<td>${board.content }</td>	
		</tr>
		<tr>
			<td>조회수</td>
			<td>${board.readCount }</td>	
		</tr>
		
		<tr>
				<td colspan="2" align="center">
									 
					<input type="button" value="수정하기" onclick="location.href='update?bno=${board.bno}'" />
					<input type="button" value="삭제하기" onclick="location.href='delete'" />
					<input type="button" value="목록보기" onclick="location.href='list'" />
				
				</td>
			</tr>
		
		
		
			

	</table>
</body>
</html>