package org.sid.equipement.handler;

import lombok.Builder;

import java.util.Date;
@Builder
public class ErrorMessage {

    private String message;
    private Date timestamp;
    private Integer code;
    public static final String BODY_REQUIRED = "tous les champs sont obligatoire!";
    public static final String ID_REQUIRED = "Id doit etre present";
    public static final String ID_ERROR = "Pas D'identifiant";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ErrorMessage() {
    }

    public ErrorMessage(String message, Date timestamp, Integer code) {
        this.message = message;
        this.timestamp = timestamp;
        this.code = code;
    }


}
