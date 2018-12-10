<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.projet.posts.Post"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Posts></title>
</head>
<body>
<h1>My posts</h1>
<ul>
	<% for(Post post : (List<Post>)request.getAttribute("posts")) { %>
		<li><a href="?id=<%= post.getId() %>"><%= post.getTitle() %></a></li>
	<% } %>
</ul>
<%= request.getAttribute("jsonString") %>
</body>
</html>