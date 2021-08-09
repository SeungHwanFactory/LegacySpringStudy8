<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>커스텀 로그인 페이지</title>
</head>
<body>
<h1><c:out value="${error}"/></h1>
<h1><c:out value="${logout}"/></h1>

<form action="/login" method='post'>

<div>
	<input type="text" name="username" value='admin'>
</div>

<div>
	<input type="password" name="password" value='admin'>
</div>

<div>
	<input type="checkbox" name="remember-me">자동 로그인
</div>

<div>
	<input type="submit">
</div>

<input type='hidden' name="${_csrf.parameterName}" value="${_csrf.token}" />

</form>
</body>
</html>