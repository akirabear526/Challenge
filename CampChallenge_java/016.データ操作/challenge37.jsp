<%-- 
    Document   : challenge37
    Created on : 2018/05/24, 15:25:15
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
        <form action="./result37.jsp" method="get">
            購入した商品の総額は？
            <input type="number" name="total">
            <br><br>
            購入した商品の数量は？
            <input type="number" name="count">
            <br><br>
            商品の種別は？
            <input type="radio" name="type" value="雑貨">
            1.雑貨
            <input type="radio" name="type" value="生鮮食品">
            2.生鮮食品
            <input type="radio" name="type" value="その他">
            3.その他
            <br><br>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
