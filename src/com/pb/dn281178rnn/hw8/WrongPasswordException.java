package com.pb.dn281178rnn.hw8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Неправильный пароль");
    }

    public WrongPasswordException(String msg) {
        super(msg);
    }
}