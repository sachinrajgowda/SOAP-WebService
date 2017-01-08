<%-- 
    Document   : final_deposit
    Created on : Feb 2, 2016, 6:55:12 PM
    Author     : sachin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit</title>
    </head>
    <body>
        <h2>Following are your account details:</h2>
        <%-- start web service invocation --%><hr/>
        <%
            com.server.wsdl.Service_Service service = new com.server.wsdl.Service_Service();
            com.server.wsdl.Service port = service.getServicePort();
            String a=request.getParameter("value");
            if(a.equals("deposit"))
            {                
                // TODO initialize WS operation arguments here
                // TODO process result here
                String result = port.deposit(request.getParameter("amount"), request.getParameter("accountNo"));               
                out.println("your Account Balance is = "+result);
            }
            else if(a.equals("withdraw"))
            {
                // TODO initialize WS operation arguments here
                // TODO process result here
                String result = port.withdraw(request.getParameter("amount"), request.getParameter("accountNo"));
                out.println("your Account Balance is = "+result);
            }
            else if(a.equals("balance"))
            {
                // TODO initialize WS operation arguments here
                // TODO process result here
                String result = port.balance(request.getParameter("accountNo"));
                out.println("your Account Balance is = "+result);
            }
        %>
        <%-- end web service invocation --%><hr/>
        <a href="index.jsp">Back to main operation</a>
    </body>
</html>
