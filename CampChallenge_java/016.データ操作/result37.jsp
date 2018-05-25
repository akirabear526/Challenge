<%-- 
    Document   : result37
    Created on : 2018/05/25, 10:31:11
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
            out.println("商品種別は" + request.getParameter("type") + "です。");
            int total=Integer.parseInt(request.getParameter("total"));
            int count=Integer.parseInt(request.getParameter("count"));
            int result = total/count;
            out.println("商品単価は" + result + "円です。");
            if(total < 3000){
                out.println("ポイントは0Pです。");
            }else if (3000 <= total && total <5000){
                out.println("ポイントは" + total*0.04 + "Pです。");
            }else{
                out.println("ポイントは" + total*0.05 + "Pです。");
            }
        %>
    </body>
</html>
