<%@page import="javax.servlet.http.HttpSession" %>
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
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <% if(!hs.getAttribute("name").equals("")){ %>
        <h1>登録確認</h1>
        名前:<%= hs.getAttribute("name")%><br>
        生年月日:<%= hs.getAttribute("year")+"年"+hs.getAttribute("month")+"月"+hs.getAttribute("day")+"日"%><br>
        種別:<%= hs.getAttribute("type")%><br>
        電話番号:<%= hs.getAttribute("tell")%><br>
        自己紹介:<%= hs.getAttribute("comment")%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
    <% }else{ %>
        <h1>入力が不完全です</h1>
    <% } %>
    <%
        UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
        //エラー処理
    if(udb.getName().equals("")){%>名前 <%}
        if(udb.getYear().equals("") || udb.getMonth().equals("") || udb.getDay().equals("") ){ %>生年月日 <% }
        if(udb.getType()!=null ){ %>種別 <% udb.setType(""); }
        if(udb.getTell().equals("")){ %>電話番号 <% }
        if(udb.getComment().equals("")){ %>自己紹介 <% }
        

        if( !udb.getName().equals("") && !udb.getYear().equals("")
            && !udb.getMonth().equals("") && !udb.getDay().equals("")
            && udb.getType()!=null && !udb.getTell().equals("")
            && !udb.getComment().equals("") ) {
    %>
            <h1>登録確認</h1>
            名前:<%= udb.getName()%><br>
            生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
            種別:<%= udb.getType()%><br>
            電話番号:<%= udb.getTell()%><br>
            自己紹介:<%= udb.getComment()%><br>
            上記の内容で登録します。よろしいですか？
            <form action="insertresult" method="POST">
                <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
                <input type="submit" name="yes" value="はい">
            </form>
     <% }else{ %>
            が入力されていません。
     <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
