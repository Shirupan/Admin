<%@ page import="com.sl.bean.Content" %>
<%@ page import="com.sl.utils.Constant" %>
<%@ page import="com.sl.resp.BaseResp" %>
<%@ page contentType="text/html;charset=utf-8" language="java" pageEncoding="utf-8" %>
<html>
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
    String getId=request.getParameter("id");
    int id=0;
    if(getId!=null) {
      id = Integer.valueOf(getId);
      Content oldCt = Constant.contents.get(id);
    }
  %>
</head>
<body>
<div class="container">
  <input id="wTitle">
  <h4>Lately library
    <span class="label label-info">Bootstrap v3.3.5</span>
  </h4>
  <div class="summernote" id="summernote"></div>
  <button id="edit" class="btn btn-primary" onclick="edit()" type="button">Edit 1</button>
  <button id="HelloButton" class="btn btn-primary" onclick="save()" type="button" name="HelloButton">Save 2</button>
</div>
</body>
<script type="text/javascript" src="/js/summernote.js"></script>

<script type="text/javascript">
  var text="我是中文";
  <%--var text="<%=oldCt.getContent()%>";--%>
//  $('.summernote').summernote('code',text);
//  $(document).ready(function() {
    $('#summernote').summernote({
      height: 300,
      lang:'zh-CN',
      <%--code:<%=oldCt.getContent()%>,--%>
      tabsize: 2,

    });
  $('#summernote').summernote('insertText', text);
//  });


</script>
<%--<script type="text/javascript">--%>
  <%--//加载编辑器--%>
  <%--$(document).ready(function() {--%>
    <%--$('.summernote').summernote({--%>
      <%--height: 400,--%>
      <%--minHeight: 300,--%>
      <%--maxHeight: 600,--%>
      <%--tabsize: 2,--%>
      <%--focus: true,--%>
      <%--lang:'zh-CN',--%>
      <%--// 重写图片上传--%>
      <%--onImageUpload: function(files, editor, $editable) {--%>
        <%--sendFile(files[0],editor,$editable);--%>
      <%--}--%>
    <%--});--%>
  <%--});--%>
  <%--//图片上传--%>
  <%--function sendFile(file, editor, $editable){--%>

    <%--var filename = false;--%>
    <%--try{--%>
      <%--filename = file['name'];--%>
    <%--} catch(e){--%>
      <%--filename = false;--%>
    <%--}--%>
    <%--if(!filename){--%>
      <%--$(".note-alarm").remove();--%>
    <%--}--%>

    <%--//以上防止在图片在编辑器内拖拽引发第二次上传导致的提示错误--%>
    <%--data = new FormData();--%>
    <%--data.append("file", file);--%>
    <%--data.append("key",filename); //唯一性参数--%>

    <%--$.ajax({--%>
      <%--data: data,--%>
      <%--type: "POST",--%>
      <%--url: "",--%>
      <%--cache: false,--%>
      <%--contentType: false,--%>
      <%--processData: false,--%>
      <%--success: function(url) {--%>
        <%--if(url=='200'){--%>
          <%--alert("上传失败！");--%>
          <%--return;--%>
        <%--}else{--%>
          <%--alert("上传成功！");--%>
        <%--}--%>
        <%--//alert(url);--%>
        <%--editor.insertImage($editable, url);--%>
        <%--//setTimeout(function(){$(".note-alarm").remove();},3000);--%>
      <%--},--%>
      <%--error:function(){--%>
        <%--alert("上传失败！");--%>
        <%--return;--%>
        <%--//setTimeout(function(){$(".note-alarm").remove();},3000);--%>
      <%--}--%>
    <%--});--%>
  <%--}--%>

<%--</script>--%>
<script>
  function save(){
    var title=$("#wTitle");
    var text=$('#summernote').summernote('code');
    console.log(text);
    var info={
      title:title.val().trim(),
      content:text
    }
    console.log("info="+JSON.stringify(info));
    $.ajax({
      type : "post",
      url : "../ContentServlet",
      async : true,
      data : "info="+JSON.stringify(info),
      dataType : "json",
      success : function(msg) {
        if (msg.status == <%=BaseResp.SUCCESS%>) {
          alert("");
//          location.href='content.jsp';
        }
        if (msg.status == <%=BaseResp.SUCCESS_INSERT%>) {
          alert("插入成功");
//          location.href='content.jsp';
        }
        if (msg.status == <%=BaseResp.ERROR%>) {
          alert("错误");
        }
      },
      error : function(XMLHttpRequest, textStatus, errorThrown) {
        alert("其他错误");
        switch (XMLHttpRequest.status)
        {

        }
      }
    });

  }
</script>
</html>
