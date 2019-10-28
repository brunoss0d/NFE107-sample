package org.cnam.sample.dto;

public class SampleResponse {
    public long id;
    public String data;

    public SampleResponse() {

    }

    public SampleResponse(long id, String data) {
        this.id = id;
        this.data = data;
    }
}
