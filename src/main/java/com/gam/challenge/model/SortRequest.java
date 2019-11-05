package com.gam.challenge;

public class SortRequest {

    private String[] values;

    public SortRequest(String[] values) {
        this.values = values;
    }

    public SortRequest() {}

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}
