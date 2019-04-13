
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.removeAttribute("username");
            session.setAttribute("uname", null);
            request.getSession(false).invalidate();            
            response.sendRedirect("Login.jsp");            
            %>
    </body>
</html>
