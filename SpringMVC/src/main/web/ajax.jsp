<%--
  User: 徐亮亮
  Date: 2021/1/6
  Time: 16:39
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<button id="button-id" type="button">提交</button>
<script>
    let userList = [];
    userList.push({
        username: "张山",
        age: 18,
    });
    userList.push({
        username: "李斯",
        age: 21,
    });
    userList.push({
        username: "王武",
        age: 19,
    });
    $("#button-id").on("click", function () {
        console.log(userList);
        $.ajax({
            url: "${pageContext.request.contextPath}/user/quick15",
            type: "POST",
            data: JSON.stringify(userList),
            contentType: "application/json;charset=utf-8",
        })
    })
</script>
</body>
</html>
