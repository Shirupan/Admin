<%@ page import="com.sl.bean.Content" %>
<%@ page import="com.sl.utils.Constant" %>
<%--
  Created by IntelliJ IDEA.
  User: Maibenben
  Date: 2016/12/9
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/datatables.min.css"/>
    <style>
        .note{
            padding: 0 50px;
        }
    </style>

</head>
<body>
<div class="note">
    <a href="content-edit.jsp">添加新笔记</a>
<table id="note" class="table table-striped table-bordered" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>id</th>
        <th>类型</th>
        <th>标题</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <%
        for (Content content: Constant.contents.values()) {
            %>
    <tr>
        <td><%=content.getId()%></td>
        <td><%=content.getType()%></td>
        <td><%=content.getTitle()%></td>
        <td><a href="content-edit.jsp?id=<%=content.getId()%>" target="_blank">编辑</a></td>
    </tr>
    <%    }
    %>
    </tbody>
</table>
</div>

</body>
<script type="text/javascript" src="/js/datatables.min.js"></script>
<script type="text/javascript" charset="utf-8">
    $(document).ready(function() {
        $('#note').DataTable();
    } );
</script>
</html>
