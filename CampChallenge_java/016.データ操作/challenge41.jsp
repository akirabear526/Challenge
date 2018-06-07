<%-- 
    Document   : challenge41
    Created on : 2018/05/25, 16:52:33
    Author     : Akirabear
--%>

<%@page import="java.net.URLDecoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = "";
            String gender = "";
            String hobby = "";
            Cookie[] cookies = request.getCookies();
            if(cookies != null){
                for(int i=0;i<cookies.length;i++) {
                    if(cookies[i].getName().equals("yourname1")) {
                    name =URLDecoder.decode(cookies[i].getValue(), "UTF-8");
                    break;
                    }
                }
                for(int i=0;i<cookies.length;i++) {
                    if(cookies[i].getName().equals("gender1")) {
                    gender =URLDecoder.decode(cookies[i].getValue(), "UTF-8");
                    break;
                    }
                }
                for(int i=0;i<cookies.length;i++) {
                    if(cookies[i].getName().equals("hobby1")) {
                    hobby =URLDecoder.decode(cookies[i].getValue(), "UTF-8");
                    break;
                    }
                }
            }
        %>
        <form action="./result41.jsp" method="post">
            あなたの名前を入力してください。
            <input type="text" name="yourname" value="<%= name %>">
            <br><br>
            あなたの性別を入力してください。
            <input type="text" name="gender" value="<%= gender %>">
            <br><br>
            あなたの趣味を入力してください。
            <input type="text" name="hobby" value="<%= hobby %>">
            <br>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
