package org.sid.equipement.handler;

import org.sid.equipement.exeption.Entitynotfoundequipement;
import org.sid.equipement.exeption.Notexistexeption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
public class Utilaiers {
@ExceptionHandler(value = {Entitynotfoundequipement.class})
    public  ResponseEntity<Object> entitynotfoundequipement(Entitynotfoundequipement ex){

        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(ex.getMessage())
                .timestamp(new Date())
                .code(404)
                .build();

        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = {Notexistexeption.class})
    public  ResponseEntity<Object> notexistexeption(Notexistexeption ex){

        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(ex.getMessage())
                .timestamp(new Date())
                .code(409)
                .build();

        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
    }

    public static  boolean isNullorEmty(List<?> list){
    return !(list != null && !list.isEmpty() );
    }

    public static  boolean isNullorEmty(Set<?> list){
        return !(list != null && !list.isEmpty() );

    }





}
