<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
<div class="container">
	<h1>COMMING SOON USER REGISTRATION</h1>
	<sform:form commandName="user" cssClass="form-horizontal"> <!--  here command name must match with controller's ModelMapping annotation attribute -->
		<!-- what is commandName -->
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Name::</label>
			<div class="col-sm-8">
				<sform:input path="name" cssClass="form-control"/> <!-- what is path  ANSWER name correspond to user(Entity) variable Name-->
			</div>
		</div>
		
		<div class="form-group">
			<label for="Email" class="col-sm-2 control-label">Email::</label>
			<div class="col-sm-8">
				<sform:input path="email" cssClass="form-control"/> <!-- what is path  -->
			</div>
		</div>
		
		<div class="form-group">
			<label for="password" class="col-sm-2 control-label">Password::</label>
			<div class="col-sm-8">
				<sform:password path="password" cssClass="form-control"/> <!-- what is path  -->
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-2" align="center">
				<input  type="submit" class="btn btn-lg btn-primary"/>
			</div>
		</div>
	</sform:form>
</div>