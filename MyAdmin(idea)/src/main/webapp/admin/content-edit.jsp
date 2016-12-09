<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="en">
<head>
  <title></title>

  <!-- include jquery -->
  <script src="/js/jquery-2.1.1.min.js"></script>

  <!-- include libraries BS3 -->
  <link rel="stylesheet" href="/css/bootstrap-3.2.0.min.css" />
  <script type="text/javascript" src="/js/bootstrap-3.2.0.min.js"></script>

  <!-- include summernote -->
  <link rel="stylesheet" href="/css/summernote.css">
  <%
      request.removeAttribute("id");
  %>
</head>
<body>
<div class="container">
  <h4>Lately library
    <span class="label label-info">Bootstrap v3.3.5</span>
  </h4>
  <div class="summernote"></div>
</div>
</body>
<script type="text/javascript" src="/js/summernote.js"></script>

<script type="text/javascript">
  $(document).ready(function() {
    $('.summernote').summernote({
      height: 300,
      tabsize: 2
    });
  });
</script>
</html>
