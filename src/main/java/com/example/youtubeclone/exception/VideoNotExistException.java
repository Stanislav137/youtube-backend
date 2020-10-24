package com.example.youtubeclone.exception;

public class VideoNotExistException extends RuntimeException {
    public VideoNotExistException(String msg) {
        super(msg);
    }
}
