package com.pb.dn281178rnn.hw8;

public class Auth {
    private String login, password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[A-Za-z0-9]{5,20}"))
            throw new WrongLoginException("Имя пользователя может содержать 5-20 символов ( только буквы и цифры)");
        if (!password.matches("\\w{6,}"))
            throw new WrongPasswordException("Пароль должен содержать минимум 6 символов и состоять из букв, цифр и символов подчеркивания");
        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Введенные пароли не совпадают!");
        this.login = login;
        this.password = password;
    }

    public void signIn(String login, String password) throws WrongLoginException, WrongPasswordException {
        if (!login.equals(this.login))
            throw new WrongLoginException();
        if (!password.equals(this.password))
            throw new WrongPasswordException();
    }

}
