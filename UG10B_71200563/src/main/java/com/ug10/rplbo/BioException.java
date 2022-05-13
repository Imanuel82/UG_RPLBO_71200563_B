package com.ug10.rplbo;

public class BioException extends Exception{
    private int errorCode;
    private String errorMess;
    public BioException(int errorCode){
        super();
        this.errorCode = errorCode;
        if(errorCode == 1){
            this.errorMess = "Maaf, bio tidak boleh kosong";
        }
        else if(errorCode == 2){
            this.errorMess = "Maaf, bio minimal harus terdiri dari 5 karakter dan maksimal 30 karakter";
        }
        else if(errorCode == 3){
            this.errorMess = "Maaf, bio tidak boleh mengandung karakter spesial selain titik, et (@), serta spasi";
        }
    }
    public String getErrorMess() {
        return errorMess;
    }
}
