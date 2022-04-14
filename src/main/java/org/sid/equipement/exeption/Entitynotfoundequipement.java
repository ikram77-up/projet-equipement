package org.sid.equipement.exeption;

public class Entitynotfoundequipement extends RuntimeException{
public final  int status;
    public final String message;
    public Entitynotfoundequipement(int status, String message) {
        this.status = status;
        this.message = message;
    }
// returner dews messages avec status


}
