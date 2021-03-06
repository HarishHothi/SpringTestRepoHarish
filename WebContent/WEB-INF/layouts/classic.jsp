<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>

<tilesx:useAttribute name="current"/> <!-- this is for the icon highlighting -->

 <div class="container">
 <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href='<spring:url value="/index"></spring:url>'>SPRING MVC TEST</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="${current == 'index' ? 'active':'' }"><a href='<spring:url value="/index"></spring:url>'>Home</a></li>
              <security:authorize access="hasRole('ROLE_ADMIN')">
              	<li class="${current == 'users' ? 'active':'' }"><a href='<spring:url value="/users"></spring:url>'>Users</a></li>
              </security:authorize>
              
              <li class="${current == 'user-register' ? 'active':'' }"><a href='<spring:url value="/register"></spring:url>'>User Registration</a></li> <!-- here /register is request mapping user controller -->
              <security:authorize access="! isAuthenticated()">
              	<li class="${current == 'login' ? 'active':'' }"><a href='<spring:url value="/login"></spring:url>'>Login</a></li>
              </security:authorize>
              
              <security:authorize access="isAuthenticated()">
              	<li><a href='<spring:url value="/logout"></spring:url>'>Logout</a></li>
              </security:authorize>
             </ul>
           </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
 </div>
 
	<tiles:insertAttribute name="body" />
	<br>
	<br>
	
	<div style="text-align:center"><tiles:insertAttribute name="footer"/></div>
	
</body>
</html>