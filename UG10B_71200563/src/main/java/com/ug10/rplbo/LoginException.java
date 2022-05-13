package com.ug10.rplbo;

public class LoginException extends Exception{
    private int errorCode;
    private String errorMess;
    public LoginException (int errorCode) {
        super() ;
        this.errorCode = errorCode ;
        if(errorCode==1) {
            this.errorMess = "Username tidak boleh kosong!";
        }
        else if (errorCode==2) {
            this.errorMess = "Password tidak boleh kosong!";
        }
        else if(errorCode==3) {
            this.errorMess = "Username dan Password  harus sesuai dengan yang telah dibuat di awal program!";
        }
    }
    public LoginException (String errorMess) {
        super(errorMess);
    }
    public int getErrorCode() {
        return this.errorCode;
    }
    public String getErrorMess() {
        return this.errorMess;
    }
}
