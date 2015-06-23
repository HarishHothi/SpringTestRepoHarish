<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<style>
.form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}

.form-signin .form-signin-heading, .form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin .checkbox {
	font-weight: normal;
}

.form-signin .form-control {
	position: relative;
	height: auto;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	padding: 10px;
	font-size: 16px;
}

.form-signin .form-control:focus {
	z-index: 2;
}

.form-signin input[type="email"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
</style>

<c:url value="/j_spring_security_check" var="loginUrl" />
<div class="container">

	<h3>Custome Login with Username and Password</h3>
	<form class="form-signin" name='f' action='/spring-test-app/login'
		method='POST'>

		<h2 class="form-signin-heading">Please sign in</h2>
		<label for="inputName" class="sr-only">USERNAME</label> <input
			type="text" name="username" class="form-control"
			placeholder="User Name" required autofocus> <label
			for="inputPassword" class="sr-only">Password</label> <input
			type="password" name="password" class="form-control"
			placeholder="Password" required>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>

	</form>



</div>
<!-- /container -->

