package com.pb.dn281178rnn.hw8;

//import java.io.Console;
import java.util.Scanner;

public class OnlineShop {


    public static void main(String[] args) {
        String login, password, confirmPassword;
        Auth auth = new Auth();
        Scanner in = new Scanner(System.in);

        System.out.println("\"Для входа на сайт требуется регистрация.\"");


        while (true) {
            System.out.println("Регистрация нового пользователя");
            System.out.print("Имя пользователя: ");
            login = in.nextLine();
            System.out.print("Пароль: ");
            password = in.nextLine();
            System.out.print("Подтверждение пароля: ");
            confirmPassword = in.nextLine();

            try {
                auth.signUp(login, password, confirmPassword);
                break;
            } catch (WrongLoginException | WrongPasswordException ex) {
                System.out.println(ex.getMessage());
            }
        }
        int attempts = 0;
        while (attempts < 3) {
            System.out.println("Авторизация");
            System.out.print("Логин: ");
            login = in.nextLine();
            System.out.print("Пароль: ");
            // В идеале стоило бы использовать readPassword(), чтобы
            //вводимый пароль не отображался и там же формат ввода задать. Но тогда придётся ловить ещё как минимум IllegalFormatException
            //а этого нет в задании :)
            //        Console c = System.console();
            //        char[] pass = c.readPassword();
            //        password = String.valueOf(pass);
            password = in.nextLine();
            try {
                auth.signIn(login, password);
                break;
            } catch (WrongLoginException | WrongPasswordException ex) {
                attempts++;
                System.out.println("Неправильный логин или пароль");
            }
        }
        if (attempts < 3)
            System.out.println("Успешная авторизация");
        else
            System.out.println("Слишком много неудачных попыток входа.");

    }


}
