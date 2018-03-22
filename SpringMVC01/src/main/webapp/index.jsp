<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="haha?methodName=addUser" >新增</a><br/>
<a href="haha?methodName=deleteUser" >删除</a><br/>
<a href="haha?methodName=updateUser" >修改</a><br/>
<a href="haha?methodName=findUser" >查找</a>
<p>-----------------------------------------------------------</p>
<a href="userController?methodName=addUser">新增</a>
<a href="userController?methodName=delUser">删除</a>
<a href="userController?methodName=updateUser">修改</a>
<a href="userController?methodName=findUser">查询</a> <br/>
<p>-----------------------------------------------------------</p>
<%-- 02. 使用了 我们的 SimpleUrlHandlerMapping--%>
<a href="user/addUser">新增</a>
<a href="user/deleteUser">删除</a>
<a href="user/updateUser">修改</a>
<a href="user/findUser">查询</a> <br/>
<p>-----------------------------------------------------------</p>
<a href="user/add">新增</a>
<a href="user/delete">删除</a>
<a href="user/update">修改</a>
<a href="user/find">查询</a> <br/>
<p>-------------------------------分割线----------------------------</p>
<a href="model/a/delete">删除</a>
</body>
</html>
