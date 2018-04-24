<%-- 
    Document   : challenge1-13
    Created on : 2018/04/24, 13:21:27
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
            int total = 0;
            for (int i=0;i<=100;i++) {
                total += i ;
            }
            out.print(total);
        %>
    </body>
</html>
