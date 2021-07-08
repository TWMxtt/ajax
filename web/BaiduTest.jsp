<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/5
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-3.5.1.js"></script>
    <script>
        $(function () {
            $("#cont").keyup(function () {
                $.ajax({
                    url:"ContextTest",
                    data:{"ConText":$("#cont").val()},
                    type:"post",
                    dataType:"json",
                    success:function (msg) {
                        $.each(msg,function (index,content) {
                            console.log(content);
                        })
                    },
                    error:function () {
                        console.log("Error Context!")
                    }
                })
            })

        })
    </script>
</head>
<body style="background-color: aliceblue">
    <input name="contextText" id="cont" type="text" style="display: block;width: 600px;height: 40px;border: coral 1px solid;margin: 0px auto;margin-top: 200px">
    <p style="display: none;width: 600px;height: 200px;border: coral 1px solid;margin: 0px auto;border-top:none;background-color: white"></p>
</body>
</html>
