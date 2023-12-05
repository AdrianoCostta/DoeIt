package com.example.doeit;

public class DataClass {

    private String dataName;
    private String dataDesc;
    private String dataStatus;
    private String dataImage;

    public String getDataName() {
        return dataName;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public String getDataImage() {
        return dataImage;
    }

    public DataClass(String dataName, String dataDesc, String dataStatus, String dataImage) {
        this.dataName = dataName;
        this.dataDesc = dataDesc;
        this.dataStatus = dataStatus;
        this.dataImage = dataImage;
    }

    public DataClass(){

    }
}
