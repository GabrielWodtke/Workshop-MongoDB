package com.gabriel.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError(){
    }

    public StandardError(Long timestamp, String path, String error, String message, Integer status) {
        this.timestamp = timestamp;
        this.path = path;
        this.error = error;
        this.message = message;
        this.status = status;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
