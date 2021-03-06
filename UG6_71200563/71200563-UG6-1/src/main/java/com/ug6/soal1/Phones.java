package com.ug6.soal1;

public class Phones {
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity = 0;
    private int romCapacity = 0;
    private int cameraResolution = 0;
    private float screenSize;

    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode) {
        this.setPhoneName(phoneName);
        this.setPhoneCode(phoneCode);
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
    }

    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode, int ramCapacity, int romCapacity, int cameraResolution, float screenSize) {
        this.setPhoneName(phoneName);
        this.setPhoneCode(phoneCode);
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
        this.setRamCapacity(ramCapacity);
        this.setRomCapacity(romCapacity);
        this.setCameraResolution(cameraResolution);
        this.setScreenSize(screenSize);
    }

    public String getPhoneName() {
        return this.phoneName;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }
    public String getAndroidCode() {
        return this.androidCode;
    }
    public int getRamCapacity() {
        return this.ramCapacity;
    }
    public int getRomCapacity() {
        return this.romCapacity;
    }
    public int getCameraResolution() {
        return this.cameraResolution;
    }
    public float getScreenSize() {
        return this.screenSize;
    }
    public String getPhoneCode() { return this.phoneCode; }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
    public void setAndroidCode(String androidCode) {
        this.androidCode = androidCode;
    }
    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
    public void setRomCapacity(int romCapacity) {
        this.romCapacity = romCapacity;
    }
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
