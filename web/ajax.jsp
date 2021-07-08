<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/5
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajaxTest</title>
    <script src="jquery-3.5.1.js"></script>
    <script>
       $(function () {
           $("#btn").click(function () {
               $.ajax({
                   url:"count",
                   data:null,
                   type:"get",
                   dataType:"text",
                   success:function (message) {
                       $("#count").text(message);
                   },
                   error:function () {
                       alert("Error");
                   }
               })
           })
       })
    </script>
</head>
<body>
    <img src="images/heiyou-1024x576.jpeg" alt="" style="width: 500px;height: 300px"><br>
    <input id="btn" type="button" value="点赞"><p>当前点赞量:<span id="count" style="color: brown">0</span></p>
</body>
</html>
