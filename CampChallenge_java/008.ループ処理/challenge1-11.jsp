<%-- 
    Document   : challenge1-11
    Created on : 2018/04/24, 11:56:36
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
            long total = 1;
            for (int i = 0; i < 20; i++) {
                total *= 8;
            }
            out.print("8の20乗は" + total + "です。");
        %>
    </body>
</html>
