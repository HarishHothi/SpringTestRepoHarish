<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"	prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <div class="container">
    <table class="table table-striped">
    	<thead>
    		<tr>
    			<th>user name</th>
    			<th>
    		</tr>
    	</thead>
    	<tbody>
    			<c:forEach items="${users}" var="user">
    				<tr>
    					<td> <a href='<spring:url value="/user/${user.id}.html"></spring:url>'>${user.name}</a>
    					</td>
    				</tr>
    			</c:forEach>
    	</tbody>
    </table>
    </div>