package com.ug10.rplbo;

public class TweetException extends Exception{
    private int errorCode;
    private String errorMess;
    public TweetException (int errorCode) {
        super() ;
        this.errorCode = errorCode ;
        if(errorCode==1) {
            this.errorMess = "Tweet tidak boleh kosong!";
        }
        else if(errorCode==2) {
            this.errorMess = "Tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter";
        }
    }
    public TweetException (String errorMess) {
        super(errorMess);
    }
    public int getErrorCode() {return this.errorCode;}
    public String getErrorMess() {return this.errorMess;}
}
