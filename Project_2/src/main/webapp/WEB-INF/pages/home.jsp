<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script>
 var app = angular.module

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
<title>Welcome To Home</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Welcom To BAZ Car Company </a>
	</div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container">
    <h1>Welcome <c:out value="${ user.username }"></c:out></h1>
</body>
</html>	
