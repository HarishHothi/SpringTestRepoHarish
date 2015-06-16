<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"	prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
    <div class="container">
    	<table class="table table-hover">
    		<thead>
    			<tr>
    				<th> User name </th>
    				<th> Email ID </th>
    				<th> Password </th>
    			</tr>
    		</thead>
    		
    		<tbody>
    			<tr>
    				<td> ${userInfo.name}</td>
    				<td>${userInfo.email}</td>
    				<td>${userInfo.password}</td>
    			</tr>
    		</tbody>
    	</table>
    </div>
