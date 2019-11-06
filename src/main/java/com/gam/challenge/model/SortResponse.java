package com.gam.challenge.model;

public class SortResponse {

    private String[] values;

    public SortResponse(String[] values) {
        this.values = values;
    }

    public SortResponse() {}

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}
