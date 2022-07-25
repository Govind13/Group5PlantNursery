package com.example.onlineplantnursery.Exception;

public class NoSuchPlantExistsException extends RuntimeException{
    private String message;

    public NoSuchPlantExistsException(){}
    public NoSuchPlantExistsException(String msg){
        super(msg);
        this.message=msg;
    }
}