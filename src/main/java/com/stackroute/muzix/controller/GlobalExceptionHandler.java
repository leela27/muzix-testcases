package com.stackroute.muzix.controller;

import com.stackroute.muzix.exceptions.TrackAlreadyExistsException;
import com.stackroute.muzix.exceptions.TrackIdAlreadyExistsException;
import com.stackroute.muzix.exceptions.TrackIdNotFoundException;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

    @ControllerAdvice
   // @Log4j
    public class GlobalExceptionHandler {

        @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="track already exists")
        @ExceptionHandler(TrackAlreadyExistsException.class)
        public void handleEmptyFieldException(TrackAlreadyExistsException e){
            System.out.println("Track is already there");
           // log.error("" + "track is already there", e);
        }

        @ResponseStatus(value= HttpStatus.CONFLICT, reason="ID already")
        @ExceptionHandler(TrackIdAlreadyExistsException.class)
        public void handleUserAlreadyExistsException(TrackIdAlreadyExistsException e){
            System.out.println("Already above track there.Try another");
           // log.error(" already above track there.Try another", e);
        }

        @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Track does not exist")
        @ExceptionHandler(TrackIdNotFoundException.class)
        public void handleUserDoesNotExistException(TrackIdNotFoundException e){
            System.out.println("Track doesnot exist");
           // log.error("Track does not exist", e);
        }

    }

