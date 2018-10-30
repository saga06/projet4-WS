package com.library.oc.library.webapp.resource;


import com.library.oc.library.business.contract.manager.AuthorService;
import com.library.oc.library.business.contract.manager.AuthorService_Service;

public class AbstractDao {

    private AuthorService_Service authorService = new AuthorService_Service();
    private AuthorService authorClient = authorService.getAuthorServicePort();

    public AuthorService_Service getAuthorService() {
        return authorService;
    }

    public void setAuthorService(AuthorService_Service authorService) {
        this.authorService = authorService;
    }

    public AuthorService getAuthorClient() {
        return authorClient;
    }

    public void setAuthorClient(AuthorService authorClient) {
        this.authorClient = authorClient;
    }
}
