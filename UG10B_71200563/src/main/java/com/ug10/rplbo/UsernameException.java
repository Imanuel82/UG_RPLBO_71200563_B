package com.ug10.rplbo;

public class UsernameException extends Exception{
    private int errorCode ;
    private String errorMess;
    public UsernameException (int errorCode) {
        super();
        this.errorCode = errorCode;
        if(errorCode==1) {
            this.errorMess = "Username tidak boleh kosong!";
        }
        else if (errorCode==2) {
            this.errorMess = "Password minimal terdiri dari 6 karakter";
        }
        else if (errorCode==3) {
            this.errorMess = "Username hanya boleh terdiri dari huruf, angka, dan simbol underscore";
        }
    }
    public UsernameException (String errorMess) {
        super (errorMess);
    }
    public int getErrorCode(){
        return this.errorCode;
    }
    public String getErrorMess() {
        return this.errorMess;
    }
}