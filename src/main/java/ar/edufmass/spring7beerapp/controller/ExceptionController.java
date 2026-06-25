package ar.edufmass.spring7beerapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// With ResponseStatus in NotFoundException, this controller can be deleted
//@ControllerAdvice
public class ExceptionController {

    //@ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(){
        return ResponseEntity.notFound().build();
    }

}
