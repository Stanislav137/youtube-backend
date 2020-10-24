package com.example.youtubeclone.exception;

public class ChannelNotExistException extends RuntimeException {
    public ChannelNotExistException(String msg) {
        super(msg);
    }
}
