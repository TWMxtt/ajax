<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/5
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>onmouseoverTest</title>
</head>
    <script src="jquery-3.5.1.js"></script>
    <script>
        $(function () {
            $("#username").blur(function () {
                var username = $("#username").val();
                $.ajax({
                    url:"onmouseover",
                    data:{"un":username},
                    type:"post",
                    dataType:"text",
                    success:function (message) {
                        $("#usernameTest").text(message);
                    }
                })
            })

        })
    </script>
<body>
    <form action="onmouseover" method="post" enctype="multipart/form-data">
        <label for="username">用户名 :</label>
        <input type="text" placeholder="请输入用户名..." id="username" name="un">
        <span id="usernameTest" style="display: inline-block;color: brown"></span>
        <br>
        <br>
        <label for="password">密  码 :</label>
        <input type="password" placeholder="请输入密码..." id="password" name="pw">
        <br>
        <br>
        <input type="submit" name="sub" value="提交">
    </form>
</body>
</html>
