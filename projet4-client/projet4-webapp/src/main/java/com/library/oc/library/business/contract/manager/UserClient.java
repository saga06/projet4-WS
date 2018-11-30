package com.library.oc.library.business.contract.manager;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-11-30T02:50:58.351+01:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://manager.contract.business.library.oc.library.com/", name = "UserClient")
@XmlSeeAlso({ObjectFactory.class})
public interface UserClient {

    @WebMethod
    @RequestWrapper(localName = "getListUser", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetListUser")
    @ResponseWrapper(localName = "getListUserResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetListUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.library.oc.library.business.contract.manager.User> getListUser(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.Object id
    );

    @WebMethod
    @RequestWrapper(localName = "getEmailUser", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetEmailUser")
    @ResponseWrapper(localName = "getEmailUserResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetEmailUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.library.oc.library.business.contract.manager.User getEmailUser(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username
    );

    @WebMethod
    @RequestWrapper(localName = "getListUserLateReturn", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetListUserLateReturn")
    @ResponseWrapper(localName = "getListUserLateReturnResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetListUserLateReturnResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.library.oc.library.business.contract.manager.User> getListUserLateReturn();

    @WebMethod
    @RequestWrapper(localName = "getUser", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.library.oc.library.business.contract.manager.User getUser(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.Integer id
    ) throws NotFoundException_Exception;

    @WebMethod
    @RequestWrapper(localName = "hashPassword", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.HashPassword")
    @ResponseWrapper(localName = "hashPasswordResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.HashPasswordResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String hashPassword(
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebMethod
    @RequestWrapper(localName = "getNbUser", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetNbUser")
    @ResponseWrapper(localName = "getNbUserResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetNbUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Integer getNbUser();

    @WebMethod
    @RequestWrapper(localName = "validateLogin", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.ValidateLogin")
    @ResponseWrapper(localName = "validateLoginResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.ValidateLoginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean validateLogin(
        @WebParam(name = "user", targetNamespace = "")
        com.library.oc.library.business.contract.manager.User user,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );
}
