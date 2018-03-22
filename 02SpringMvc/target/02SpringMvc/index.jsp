<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<%-- 01.第一种方式 使用 注解--%>
<a  href="user/add">新增</a>
<a  href="user/update">修改</a>
<a  href="user/delete">删除</a>
<a  href="user/find">查询</a>  <br/>
<hr/>
<%-- 02.验证后台不返回ModelAndView--%>
<a  href="model/add">新增</a>
<a  href="model/update">修改</a> <br/>
<%-- 03.验证后台通配符的使用--%>
<p>-------------------------------分割线----------------------------</p>
<a href="/model/a/a/a/delete">删除</a>
<%-- 04.前端传递参数--%>
<form action="params/haha" method="post">
    用户名： <input name="userName">
    密码： <input type="password" name="password">
    <input type="submit" value="注册">
</form>
<p>-------------------------------分割线----------------------------</p>
<%-- 04.前端传递参数--%>
<form action="params/a" method="post">
    用户名： <input name="userName">
    密码： <input type="password" name="password">
    <input type="submit" value="注册">
</form>
<p>-------------------------------分割线----------------------------</p>
<%-- 04.前端传递参数--%>
<form action="params/add" method="post">
    用户名： <input name="userName">
    密码： <input type="password" name="password">
    <input type="submit" value="注册">
</form>
</body>
</html>
