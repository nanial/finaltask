<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello from FinalTask</title>
  </head>
    <body>

        <form action="controller" method="post">
          <input type="hidden" name="command" value="authorization"/>
          <input type="text" name="login" value=""/>
            <input type="password" name="pass" value=""/>
          <input type="submit" value="Sing in"/>
        </br>

        </form>
    </body>
</html>