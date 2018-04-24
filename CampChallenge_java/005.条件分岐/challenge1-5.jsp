<%-- 
    Document   : challenge1-5
    Created on : 2018/04/18, 14:41:02
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
            int num = 2;
            if (num == 1){
                out.print("１です！");
            } else if (num == 2){
                out.print("プログラミングキャンプ！");
            } else {
                out.print("その他です！");
            }
        %>
    </body>
</html>
