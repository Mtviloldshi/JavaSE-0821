package com.ambition.exceptions;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/16:32
 * @Description: 自定义异常
 */
public class UserException extends RuntimeException{

    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(Throwable cause) {
        super(cause);
    }

    public UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
