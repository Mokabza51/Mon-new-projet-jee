<%@page import="posts.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Posts></title>
</head>
<body>
<h1>My posts</h1>
<ul>
	<% Post post = (Post) request.getAttribute("post"); %>
	<li><a href="?id=<%= post.getId() %>"><%= post.getTitle() %></a></li>
</ul>
</body>
</html>