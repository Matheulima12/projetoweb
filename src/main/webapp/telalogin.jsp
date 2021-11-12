<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 12/11/2021
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<html>
  <head>
    <title>Tela Login</title>
  </head>
  <body>

  <div class="lista">
    <%for (String l : (List<String>) request.getAttribute("logins")) {%>
    <%= l %>
    <br/>
    <%}%>
  </div>
  
  </body>
</html>
