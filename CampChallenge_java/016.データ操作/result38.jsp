<%-- 
    Document   : result38
    Created on : 2018/05/25, 13:19:50
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
        <%@ page import="java.util.ArrayList" %>
        <%
            ArrayList<Integer> result = new ArrayList<Integer>();
            int number = Integer.parseInt(request.getParameter("num"));
            int num = number;
            while(num%2==0){
                num=num/2;
                result.add(2);
            }
            while(num%3==0){
                num=num/3;
                result.add(3);
            }
            while(num%5==0){
                num=num/5;
                result.add(5);
            }
            while(num%7==0){
                num=num/7;
                result.add(7);
            }
            String calculate = "";
            for(int i = 0; i < result.size(); i++){
                calculate += result.get(i);
                if(i==result.size() -1){
                    break;
                }
                calculate += "*";
            }
            if(num==1){
                out.println(number + "=" + calculate);
            }else{
                out.println(number + "=" + calculate + "あまり" + num);
            }
            
        %>
    </body>
</html>
