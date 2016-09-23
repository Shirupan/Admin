<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<style type="text/css">
li {
	list-style: none;
}

li:hover {
	background-color: #abcbca;
}

li a {
	color: #111111;
	text-decoration: none;
	font-size: 18px;
}

li ul {
	display: block;
}
</style>
<script type="text/javascript">
	function clickli(l) {
		var lis = document.getElementsByTagName("li");
		for (var i = 0; i < lis.length; i++) {
			// 				lis[i].style.backgroundColor = "#456321";
			lis[i].ul.style.display = "block";
		}
		// 			l.style.backgroundColor = "#abcbca";
		l.ul.style.display = "none";
	}
</script>
<title>Insert title here</title>
</head>
<body style="background-color: #4a9cd6;">
	<ul>
		<li onclick="clickli(this)"><a href="#">菜单一</a>
			<ul>
				<li><a href="#">菜单1</a></li>
				<li><a href="#">菜单2</a></li>
				<li><a href="#">菜单3</a></li>
				<li><a href="#">菜单4</a></li>
			</ul></li>
		<li onclick="clickli(this)"><a href="left.jsp" target="right">left</a></li>
		<li onclick="clickli(this)"><a href="head.jsp" target="right">head</a></li>
		<li onclick="clickli(this)"><a href="welcome.html" target="right">welcome</a></li>
	</ul>
</body>
</html>