<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="student/haha" method="post">
    姓名： <input name="name">
    年龄： <input name="age">
    <input type="submit" value="注册">
</form>
<p>----------------分割线----------------------------------------</p>
<form action="student/xixi" method="post">
    姓名： <input name="name">
    年龄： <input name="age">
    姓名： <input name="teacher.name">
    年龄： <input name="teacher.age">
    <input type="submit" value="注册">
</form>
</body>
</html>
