package com.hector.foody.DataModels;

public class APIResponse {

    String status;
    FetechedData data;

    public APIResponse() {
    }

    public APIResponse(String status, FetechedData data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public FetechedData getData() {
        return data;
    }
}
