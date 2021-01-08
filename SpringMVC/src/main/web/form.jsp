<%--
  User: 徐亮亮
  Date: 2021/1/6
  Time: 11:22
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick14" method="post">
    <input name="userList[0].username">
    <input name="userList[0].age" type="number">
    <br>
    <input name="userList[1].username">
    <input name="userList[1].age" type="number">
    <br>
    <input name="userList[2].username">
    <input name="userList[2].age" type="number">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
