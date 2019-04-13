<%
    String name;
    name = (String)session.getAttribute("username");
    if( name != null){
        out.print("<br>  Welcome back "+ session.getAttribute("username")  );
    }
    else{
        name = request.getParameter("username");
        session.setAttribute("username",name);
        out.print(" Welcome "+ name);
    }
%>
<html>
    <form action="logout.jsp" method="POST">
        <input type="submit" name="submit" value="Log Out"/ >
    </form>
</html>