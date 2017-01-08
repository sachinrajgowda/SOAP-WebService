<%-- 
    Document   : balance
    Created on : Feb 2, 2016, 6:09:38 PM
    Author     : sachin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Balance Page</title>
    </head>
    <body>
        <div>
            <h1>BALANCE</h1>
            <p>Enter Account number to show balance</p>
            <form action="final.jsp" method="post">
                <input type="hidden" name="value" value="balance"/>
                Account Number:<input type="text" name="accountNo"/>
                <input type="submit" value="SUBMIT"/>
            </form>
        </div>
</body>
</html>
