<%-- 
    Document   : result
    Created on : 2018/05/24, 11:38:39
    Author     : Akirabear
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
        String text1 = request.getParameter("yourName");
        String text2 = request.getParameter("gender");
        String text3 = request.getParameter("hobby");
        out.println("あなたの名前は" + text1 + "です。");
        out.println("性別は" + text2 + "です。");
        out.println("趣味は" + text3 + "です。");
        %>
    </body>
</html>
