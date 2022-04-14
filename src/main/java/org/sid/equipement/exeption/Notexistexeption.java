package org.sid.equipement.exeption;

public class Notexistexeption extends RuntimeException{

    public Notexistexeption() {
    }

    public Notexistexeption(String message) {
        super(message);
    }
}
