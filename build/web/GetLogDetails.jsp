<%-- 
    Document   : GetLogDetails
    Created on : Jul 19, 2017, 11:23:29 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GetLogDetails Page</title>
    </head>
    <body>
        <%-- <jsp:include page="Template.jsp"></jsp:include>--%>
        <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr>
                 <td><jsp:include page="/GetLogDetails">
                        <jsp:param name="title" value="GetLodDetails"/>
                    </jsp:include>
            </table>
    </body>
</html>
