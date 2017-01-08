/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sachin
 */
@WebService(serviceName = "service")
public class service {
    double final_amount=0;
    /**
     * Web service operation
     */
    @WebMethod(operationName = "deposit")
    public String deposit(String amount, String account_no) {
        //TODO write your implementation code here:
        double amt=Double.valueOf(amount);  
        int accno=Integer.valueOf(account_no);
        if(accno==1)
        {
            final_amount+=amt;
            return Double.toString(final_amount);
        }
        else
            return "Incorrect Account number";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "withdraw")
    public String withdraw(String amount, String account_no) {
        //TODO write your implementation code here:
        double amt=Double.valueOf(amount);
        int accno=Integer.valueOf(account_no);
        if(accno==1)
        {
            final_amount-=amt;
            if(final_amount<0)
                return "Low balance";
            return Double.toString(final_amount);
        } 
        else
            return "Incorrect Account number";
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "balance")
    public String balance(String account_no) {
        //TODO write your implementation code here:
         int accno=Integer.valueOf(account_no);
        if(accno==1)
            return Double.toString(final_amount);
        else
            return "Incorrect Account number";
    }
}
