<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/5
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-3.5.1.js"></script>
    <script>
        $(function () {
            $.ajax({
                url:"jsons",
                data:null,
                type:"post",
                success:function (msg) {
                    console.log(msg);
                },
                dataType:"json"
            })
        })
    </script>
</head>
<body>

</body>
</html>
