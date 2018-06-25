<%@page import="javax.servlet.http.HttpServlet" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <%
        String name = "";
        String year = "";
        String month = "";
        String day = "";
        String type = "";
        String tell = "";
        String comment = "";
        
        if(hs.getAttribute("udb")!=null){
            UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
            name = udb.getName();
            year = udb.getYear();
            month = udb.getMonth();
            day = udb.getDay();
            if(udb.getType()!=null){
                type = udb.getType();
            }
            tell = udb.getTell();
            comment = udb.getComment();
        }
    %>
    <form action="insertconfirm" method="POST">
        名前:
        <input type="text" name="name" value="">
        <input type="text" name="name" 
               value="<%= name%>" >
        <br><br>

        生年月日:
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>" 
                    <% if(year.equals(String.valueOf(i))){%> 
                        selected ="selected" 
                    <%}%> ><%=i%></option>
            <% } %>   
        </select>年
        
        <select name="month">
            <option value="">--</option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>" 
                    <% if(month.equals(String.valueOf(i))){%> 
                        selected ="selected"
                    <%}%> ><%=i%></option>
            <% } %>   
        </select>月
        
        <select name="day">
            <option value="">--</option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>" 
                    <% if(day.equals(String.valueOf(i))){%> 
                        selected ="selected"
                    <%}%> ><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1"
               <% if(type.equals("1")){%> checked <%}%> >エンジニア<br>
        <input type="radio" name="type" value="2"
               <% if(type.equals("2")){%> checked <%}%> >営業<br>
        <input type="radio" name="type" value="3"
               <% if(type.equals("3")){%> checked <%}%> >その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" 
               <% if(tell!=null){ %>
                   value="<%= tell%>"
               <%}%> >
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%= comment%></textarea><br><br>

        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
