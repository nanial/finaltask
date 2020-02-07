<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07.02.2020
  Time: 6:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Autorization page</title>
</head>
<body>
<%by.training.bean.User user;
    user = (by.training.bean.User)request.getAttribute("user");
    out.print(user.getName());
%>
</body>
</html>
