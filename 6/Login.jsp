<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%	
	String name = (String)session.getAttribute("username");
	if( name != null){
		response.sendRedirect("process.jsp");
	}
%>
<html>
    <head>

    </head>
    <body>
        <form action="process.jsp" method="POST" > 
            <input type="text" name="username" />
            <input type="text" name="password" />
            <input type="submit" name="submit"/>
        </form>
    </body>
</html>

</body>
</html>
