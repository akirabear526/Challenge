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
        <form　action = "./test.jsp" method = post>
            <%
                out.print("名前を入力してください。");
                %>
            <br>
            <input type="text" name="yourName">
            <input type="submit" name="btnSubmit">
            <br><br>
            <%
                out.print("性別を選択してください。");
            %>
            <br>
            <%
                out.print("男性");
                %>
            <input type="radio" name="gender" value="male">
            <%
                out.print("女性");
                %>
            <input type="radio" name="gender" value="female">
            <br><br>
            <%
                out.print("あなたの趣味を入力してください。");
                %>
            <br>
            <textarea name="hobby"></textarea>
            <input type="submit" name="btnSubmit"> 
                    
    </body>
</htm