
package com.server.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "service", targetNamespace = "http://service.server.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://service.server.com/", className = "com.server.wsdl.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://service.server.com/", className = "com.server.wsdl.WithdrawResponse")
    @Action(input = "http://service.server.com/service/withdrawRequest", output = "http://service.server.com/service/withdrawResponse")
    public String withdraw(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deposit", targetNamespace = "http://service.server.com/", className = "com.server.wsdl.Deposit")
    @ResponseWrapper(localName = "depositResponse", targetNamespace = "http://service.server.com/", className = "com.server.wsdl.DepositResponse")
    @Action(input = "http://service.server.com/service/depositRequest", output = "http://service.server.com/service/depositResponse")
    public String deposit(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "balance", targetNamespace = "http://service.server.com/", className = "com.server.wsdl.Balance")
    @ResponseWrapper(localName = "balanceResponse", targetNamespace = "http://service.server.com/", className = "com.server.wsdl.BalanceResponse")
    @Action(input = "http://service.server.com/service/balanceRequest", output = "http://service.server.com/service/balanceResponse")
    public String balance(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
