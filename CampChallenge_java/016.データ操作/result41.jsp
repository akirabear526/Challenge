<%-- 
    Document   : result41
    Created on : 2018/06/07, 11:22:22
    Author     : Akirabear
--%>


<%@page import="java.net.URLEncoder"%>
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
        String text1 = request.getParameter("yourname");
        String text2 = request.getParameter("gender");
        String text3 = request.getParameter("hobby");
        out.println("あなたの名前は" + text1 + "です。");
        out.println("性別は" + text2 + "です。");
        out.println("趣味は" + text3 + "です。");
        Cookie c = new Cookie("yourname1", URLEncoder.encode(text1, "UTF-8"));
        c = new Cookie("gender1", URLEncoder.encode(text2, "UTF-8"));
        c = new Cookie("hobby1", URLEncoder.encode(text3, "UTF-8"));
        c.setMaxAge(3600);
        response.addCookie(c);
        %>
    </body>
</html>
