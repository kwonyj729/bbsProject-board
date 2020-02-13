<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트 페이지</title>

<style>
.table-1 {
	width: 40%;
	border: 1px solid #333333;
	border-collapse: collapse;
	text-align: center;
}

td, th {
	padding: 5px;
	border: 1px solid #333333;
}

#table-head {
	background-color: yellow;
}
</style>

</head>
<body>
	<h3>리스트 페이지</h3>

	<table class="table-1">
		<tr>
			<td colspan="5" align="left"><input type="button" value="글쓰기"
				onclick="location.href='input'" /></td>
		</tr>

		<tr id="table-head">
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="board" items="${list }">
			<tr>
				<td>${board.bno }</td>
				<td><a href="update?bno=${board.bno}">${board.title }</a></td>
				<td>${board.writer }</td>
				<td><fmt:formatDate value="${board.regDate }" /></td>
				<td>${board.readCount }</td>
			</tr>
		</c:forEach>


		<!-- 페이징 처리하기 -->
		<tr>
			<td colspan="5" align="center">
				<c:if test="${pageMaker.prev}">
					<a href="${pageMaker.startPage-1}">이전</a>
				</c:if> 
				
				<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
					<c:choose>
						<c:when test="${pageMaker.cri.page ==i }">${idx}</c:when>
						<c:otherwise>
							<a href="${idx}">${idx}</a>
						</c:otherwise>
					</c:choose>
				</c:forEach> 
				<c:if test="${pageMaker.next && pageMaker.endPage >0}">
					<a href="${pageMaker.endPage+1}">다음</a>
				</c:if>
			</td>
		</tr>


	</table>






</body>
</html>