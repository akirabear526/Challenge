<%-- 
    Document   : challenge1-3
    Created on : 2018/04/18, 13:12:35
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
            final int num1 = 100;
            int num2 = 5;
            
            int tashi = num1 + num2;
            int hiki = num1 - num2;
            int kake = num1 * num2;
            int wari = num1 / num2;
            int amari = num1 % num2;
            out.print(tashi );
            out.print(hiki );
            out.print(kake );
            out.print(wari );
            out.print(amari );
        %>
    </body>
</html>
