<%--
  User: 徐亮亮
  Date: 2021/1/8
  Time: 22:12
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick22" method="post" enctype="multipart/form-data">
    <label>名称：<input name="username" required></label> <br>
    <label>文件：<input type="file" accept="image/*" name="upload" required></label> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
