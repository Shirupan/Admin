<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
// 	UserModel user = (UserModel)session.getAttribute("user");
// 	if(!RightServer.existUserRight(user))
// 	{
// 		out.clear();
// 		out.print("<script>window.location.href='login.jsp'</script>");
// 		return;
// 	}
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Shirp后台</title>
</head>
<frameset rows="10%,*" cols="*" frameborder="0" border="0"
	framespacing="0">
	<frame src="head.jsp" name="head" scrolling="No" noresize="noresize">
	<frameset cols="15%,*" rows="*" id="attachucp" frameborder="1"
		border="1" framespacing="0">
		<frame src="left.html" name="leftFrame" scrolling="auto"
			noresize="noresize" id="leftFrame">
		<frameset rows="5%,*" cols="*" frameborder="1" border="1" framespacing="0">
		<frame src="righttop.jsp" scrolling="auto" name="rightTop" id="rightTop">
			<frame src="content.jsp" scrolling="auto" name="right"
				id="rightFrame">
		</frameset>
	</frameset>
</frameset>
</html>
