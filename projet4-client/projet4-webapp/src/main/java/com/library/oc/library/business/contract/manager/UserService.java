package com.library.oc.library.business.contract.manager;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-11-03T04:51:32.496+01:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "UserService",
                  wsdlLocation = "http://localhost:8080/services/UserService?wsdl",
                  targetNamespace = "http://manager.contract.business.library.oc.library.com/")
public class UserService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://manager.contract.business.library.oc.library.com/", "UserService");
    public final static QName UserPort = new QName("http://manager.contract.business.library.oc.library.com/", "UserPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/UserService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/UserService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public UserService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UserService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UserService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UserClient
     */
    @WebEndpoint(name = "UserPort")
    public UserClient getUserPort() {
        return super.getPort(UserPort, UserClient.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserClient
     */
    @WebEndpoint(name = "UserPort")
    public UserClient getUserPort(WebServiceFeature... features) {
        return super.getPort(UserPort, UserClient.class, features);
    }

}