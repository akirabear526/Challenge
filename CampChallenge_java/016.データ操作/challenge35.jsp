<%-- 
    Document   : challenge34
    Created on : 2018/05/21, 15:40:19
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
        <form action = "./result.jsp" method = post>
            <%
                out.print("名前を入力してください。");
            %>
            <br>
            <input type="text" name="yourName">
            <br><br>
            <%
                out.print("性別を選択してください。");
            %>
            <br>
            <%
                out.print("男性");
            %>
            <input type="radio" name="gender" value="男性">
            <%
                out.print("女性");
            %>
            <input type="radio" name="gender" value="女性">
            <br><br>
            <%
                out.print("あなたの趣味を入力してください。");
            %>
            <br>
            <textarea name="hobby"></textarea>
            <br><br>
            <input type="submit" value="送信"> 
        </form>
    </body>
</html>
