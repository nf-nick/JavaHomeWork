package com.pb.dn281178rnn.hw8;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Не правильное имя пользователя.");
    }

    public WrongLoginException(String msg) {
        super(msg);
    }
}
