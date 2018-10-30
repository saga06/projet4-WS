package com.library.oc.library.webapp.action;

import com.library.oc.library.business.contract.manager.Author;
import com.library.oc.library.business.contract.manager.Book;
import com.library.oc.library.business.contract.manager.Theme;
import com.library.oc.library.business.contract.manager.User;
import com.library.oc.library.business.contract.manager.BookBorrowed;
import com.library.oc.library.business.contract.manager.Book_Service;
import com.library.oc.library.business.contract.manager.UserService_Service;
import com.library.oc.library.business.contract.manager.UserService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;


/**
 * Action de gestion des {@link User}
 */
public class GestionUserAction extends ActionSupport {


    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Eléments en sortie
    private User user;
    // ----- Eléments en sortie
    private List<Book> listBook;
    private Book book;
    private List<User> listUser;
    private List<Book> listEditor;
    private List<Author> authors;
    private List<Theme> themes;

    private List<BookBorrowed> listBookBorrowedByUser;

    private Book_Service bookService = new Book_Service();
    private Book bookClient = bookService.getBookPort();

    private UserService_Service userService = new UserService_Service();
    private UserService userClient = userService.getUserServicePort();


    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }

    public void setId(Integer pId) {
        id = pId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }

    public List<Book> getListEditor() {
        return listEditor;
    }

    public void setListEditor(List<Book> listEditor) {
        this.listEditor = listEditor;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    public List<BookBorrowed> getListBookBorrowedByUser() {
        return listBookBorrowedByUser;
    }

    public void setListBookBorrowedByUser(List<BookBorrowed> listBookBorrowedByUser) {
        this.listBookBorrowedByUser = listBookBorrowedByUser;
    }


    // ==================== Méthodes ====================

    /**
     * Action affichant les ouvrages emprunté par un {@Link User}
     *
     * @return success / erreur
     */
    public String doListBookBorrowedByUser() {
        if (id == null) {
            this.addActionError("No id user");
        } else {
            listBookBorrowedByUser = bookClient.getListBookBorrowedByUser(id);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}

