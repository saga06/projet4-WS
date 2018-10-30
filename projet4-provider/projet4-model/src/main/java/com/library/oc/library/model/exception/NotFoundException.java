package com.library.oc.library.model.exception;

/**
 * Classe d'exception levée quand l'objet métier demandé n'a pas été trouvé
 *
 * @author sga
 */
public class NotFoundException extends Exception {

    /**
     * Constructeur par défaut.
     */
    public NotFoundException() {
    }


    /**
     * Constructeur.
     *
     * @param pMessage -
     */
    public NotFoundException(String pMessage) {
        super(pMessage);
    }


    /**
     * Constructeur.
     *
     * @param pMessage -
     * @param pCause -
     */
    public NotFoundException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }
}
