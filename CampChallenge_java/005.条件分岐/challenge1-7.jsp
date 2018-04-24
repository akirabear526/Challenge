<%-- 
    Document   : challenge1-7
    Created on : 2018/04/18, 15:37:42
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
            char word = 'あ';
            switch(word) {
                case 'A':
                    out.print("英語");
                    break;
                case 'あ':
                    out.print("日本語");
                    break;
            }
        %>
    </body>
</html>
