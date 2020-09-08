package com.ambition.exceptions;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/16:34
 * @Description:
 */
public class UserExistException extends UserException{

    public UserExistException() {
    }

    public UserExistException(String message) {
        super(message);
    }
}
