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
 * 2018-11-13T18:03:07.272+01:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://manager.contract.business.library.oc.library.com/", name = "AuthorClient")
@XmlSeeAlso({ObjectFactory.class})
public interface AuthorClient {

    @WebMethod
    @RequestWrapper(localName = "getAuthor", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetAuthor")
    @ResponseWrapper(localName = "getAuthorResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetAuthorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.library.oc.library.business.contract.manager.Author getAuthor(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.Integer id
    ) throws NotFoundException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getListAuthor", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetListAuthor")
    @ResponseWrapper(localName = "getListAuthorResponse", targetNamespace = "http://manager.contract.business.library.oc.library.com/", className = "com.library.oc.library.business.contract.manager.GetListAuthorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.library.oc.library.business.contract.manager.Author> getListAuthor();
}
