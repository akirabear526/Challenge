<%-- 
    Document   : challenge1-8
    Created on : 2018/04/18, 16:47:51
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
        <%@ page import = "java.util.ArrayList"%>
        <%
            ArrayList<String> dates = new ArrayList<String>();
            
            dates.add("10");
            dates.add("100");
            dates.add("soeda");
            dates.add("hayashi");
            dates.add("-20");
            dates.add("118");
            dates.add("END");
            
            dates.set(2,"33");
            
            out.print(dates.get(0));
            out.print(dates.get(1));
            out.print(dates.get(2));
            out.print(dates.get(3));
            out.print(dates.get(4));
            out.print(dates.get(5));
            out.print(dates.get(6));
        %>
    </body>
</html>
