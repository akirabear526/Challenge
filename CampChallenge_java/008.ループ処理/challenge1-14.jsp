<%-- 
    Document   : challenge1-14
    Created on : 2018/04/24, 13:51:07
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
            float total = 1000;
            while (total>=100) {
                total = total / 2;
            }
            out.print(total);
        %>
    </body>
</html>
