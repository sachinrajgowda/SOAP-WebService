<%-- 
    Document   : withdraw
    Created on : Feb 2, 2016, 6:09:24 PM
    Author     : sachin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdraw Page</title>
    </head>
    <body>
        <div>
            <h1>WITHDRAW</h1>
            <p>Enter Amount and Account number withdraw</p>
            <form action="final.jsp" method="post">
                <input type="hidden" name="value" value="withdraw"/>
                Amount:<input type="text" name="amount"/>
                Account Number:<input type="text" name="accountNo"/>
                <input type="submit" value="SUBMIT"/>
            </form>
        </div>
 </body>
</html>
