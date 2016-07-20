<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<jsp:include page="${context}/global/top.jsp" />
<jsp:include page="${context}/global/header.jsp" />

<div class="box">
	<h2>서비스를 이용하시려면 회원가입을 해야 합니다</h2>
	<a href="${context}/member/service/regist.jsp">회원가입</a> <br />
    <a href="${context}/member/service/login.jsp">로그인</a>
</div>
<jsp:include page="${context}/global/footer.do" />
<jsp:include page="${context}/global/end.do" />