<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="container">

	<div align="center">User Name:: ${userInfo.name}</div>
	<br>
	<br>
	<div align="left">User EmailId:: ${userInfo.email}</div>
	<div align="right">User Password:: ${userInfo.password}</div>
	<br>
	<br>
	<c:forEach items="${userInfo.blogs}" var="blog">
		<div align="center">${blog.name}</div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Item Title</th>
					<th>Item Link</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${blog.items}" var="item">
					<tr>
						<td>${item.title}</td>
						<td><a href='<spring:url value="${item.link}"></spring:url>' target="_blank">${item.link} </a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:forEach>
</div>