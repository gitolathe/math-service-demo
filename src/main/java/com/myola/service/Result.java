package com.myola.service;

import java.util.Date;

/**
 * Created by olath_000 on 2016-11-29.
 */
public class Result {
    private Integer result;
    private String host;
    private String timestamp;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
