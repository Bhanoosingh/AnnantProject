<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
		<nav class="navbar navbar-default">
			<div class="navbar-header">
				<a href="" class="navbar-brand"><img src="images/niit.jpg"
					alt="NIIT" height="40px" width="70px"></a>
			<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#navbardemo" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
			</div>
			<div class="collapse navbar-collapse" id="navbardemo">
			<ul class="nav navbar-nav">
				<li><a href="#" class="fontSize">Home</a></li>
				<li><a href="#">Browse all products</a>
				<li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Select By Category<span class="caret"></span></a>
					
				<ul class="dropdown-menu">
				<li><a href="#">Kitchen and Dining</a></li>
				<li><a href="#">Furniture</a><li>
				<li><a href="#">All</a></li>
				</ul>
			   </li>
			   <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
				<li><a href="#">Sign Up</a></li>
				<li><a href="#">Sign In</a></li>
				<li><a href="#">Sign out</a></li>
			</ul>
			</div>
		</nav>
	</div>

</body>
</html>