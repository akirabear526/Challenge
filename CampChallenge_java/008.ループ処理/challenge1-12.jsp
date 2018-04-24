<%-- 
    Document   : challenge1-12
    Created on : 2018/04/24, 13:05:00
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
            String text = "A";
            for(int i=1; i<30; i++) {
                text =text + "A";
            }
            out.print(text);
        %>
    </body>
</html>
