<%-- 
    Document   : challenge1-10
    Created on : 2018/04/19, 15:41:34
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
        <%@ page import="java.util.HashMap" %>
        <%
            HashMap<String, String> prof = new HashMap<String, String>();
            
            prof.put("1", "AAA");
            prof.put("hello", "world");
            prof.put("soeda", "33");
            prof.put("20", "20");
        %>
    </body>
</html>
