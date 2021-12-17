package com.pb.dn281178rnn.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class PhoneBook {
    public static List<Contact> contacts = new ArrayList<>();
    public static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {

        contacts.add(new Contact("Григорьев", "25.05.1995", Arrays.asList("72221110000", "380555555555"), "Россия"));
        contacts.add(new Contact("Рыбалка", "28.11.1978", Arrays.asList("3805552227777", "3806668882222"), "Украина"));
        contacts.add(new Contact("Аверин", "07.07.2007", Arrays.asList("380999999999", "380666000666"), "Украина"));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите пункт:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Поиск контакта");
            System.out.println("4. Сортировать по имени");
            System.out.println("5. Сортировать по дате");
            System.out.println("6. Редактирвать контакт");
            System.out.println("7. Сохранить в файл");
            System.out.println("8. Загрузить из файла");
            System.out.println("9. Показать телефонную книгу");
            System.out.println("10. Выход");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    addContact(scan);
                    break;
                case "2":
                    delContact(scan);
                    break;
                case "3":
                    search(scan);
                    break;
                case "4":
                    sortByName(scan);
                    break;
                case "5":
                    sortByDate(scan);
                    break;
                case "6":
                    editContact(scan);
                    break;
                case "7":
                    addToFile();
                    break;
                case"8":
                    loadFromFile();
                    break;
                case "9":
                    for(Contact i: contacts) {
                        System.out.println(i);
                    }
                    break;
                case "10":
                    return;
                default:
                    System.out.println("Ошибка! Выберите пункт меню заново");
            }
        }
    }


    public static void addContact(Scanner scan) {
        System.out.println("Введите ФИО");
        String name = scan.nextLine();

        System.out.println("Введите дату рождения:");
        String DOB = scan.nextLine();

        boolean myCase = true;
        List<String> phones = new ArrayList<>();

        while (myCase) {
            System.out.println("Введите дату рождения:");
            String phone = scan.nextLine();
            phones.add(phone);

            System.out.println("Выберите:");
            System.out.println("1. Добавить ещё один номер");
            System.out.println("2. Выход");

            String choice = scan.nextLine();

            if(Objects.equals(choice, "2")) {
                myCase = false;
            }
        }

        System.out.println("Введите адрес:");
        String address = scan.nextLine();

        contacts.add(new Contact(name, DOB, phones, address));
    }

    public static void delContact(Scanner scan) {
        System.out.println("Выберите какой контакт удалить:");
        String name = scan.nextLine();

        boolean myCase = contacts.removeIf(item -> Objects.equals(item.getName(), name));

        if(myCase) {
            System.out.println("Контакт «" + name + "» был успешно удалён");
        } else {
            System.out.println("Конакт не найден!");
        }
    }

    public static void search(Scanner scan) {
        System.out.println("Поиск. Введите имя:");
        String name = scan.nextLine();
        String searchContact = null;

        for(Contact item: contacts) {
            if(Objects.equals(item.getName(), name)) {
                searchContact = item.toString();
                break;
            }
        }

        if(searchContact == null) {
            System.out.println("Конакт не найден!");
        } else {
            System.out.println(searchContact);
        }
    }


    public static void sortByName(Scanner scan) {
        System.out.println("Исходный список:");
        for(Contact i: contacts) {
            System.out.println(i);
        }

        contacts.sort(Comparator.comparing(Contact::getName));

        System.out.println("Отсортированый по именам список:");
        for(Contact i: contacts) {
            System.out.println(i);
        }
    }


    public static void sortByDate(Scanner scan) {
        System.out.println("Исходный список:");
        for(Contact i: contacts) {
            System.out.println(i);
        }

        contacts.sort(Comparator.comparing(Contact::getDateNTime));

        System.out.println("Отсортированый по дате список:");
        for(Contact i: contacts) {
            System.out.println(i);
        }
    }


    public static void editContact(Scanner scan) {
        System.out.println("Введите имя контакта для редактирования:");
        String name = scan.nextLine();
        String field = "";

        while (!Objects.equals(field, "4")) {
            System.out.println("Выберите редактируемое поле:");
            System.out.println("1. День рождения\n2. Номер\n3. Адрес\n4. Выход");
            field = scan.nextLine();

            switch (field) {
                case "1":
                    System.out.println("Введите новую дату дня рождения:");
                    String newDOB = scan.nextLine();
                    for(Contact item: contacts) {
                        if(Objects.equals(item.getName(), name)) {
                            item.setDOB(newDOB);
                            break;
                        }
                    }
                    break;
                case "2":
                    boolean myCase = true;
                    List<String> phones = new ArrayList<>();

                    while (myCase) {
                        System.out.println("Введите номер:");
                        String phone = scan.nextLine();
                        phones.add(phone);

                        System.out.println("Выберите:");
                        System.out.println("1. Добавить ещё один номер");
                        System.out.println("2. Выход");

                        String choice = scan.nextLine();

                        if(Objects.equals(choice, "2")) {
                            myCase = false;
                        }
                    }

                    for(Contact item: contacts) {
                        if(Objects.equals(item.getName(), name)) {
                            item.setPhones(phones);
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Введите новый адрес:");
                    String newAddress = scan.nextLine();
                    for(Contact item: contacts) {
                        if(Objects.equals(item.getName(), name)) {
                            item.setAddress(newAddress);
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Контакт изменён!");
                    break;
                default:
                    System.out.println("Ошибка! Выберите пункт меню заново");
            }

            Date date = new Date();
            for(Contact item: contacts) {
                if(Objects.equals(item.getName(), name)) {
                    item.setDateNTime(date);
                    break;
                }
            }
        }
    }

    public static void addToFile() throws IOException {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(contacts);

        try(Writer writer = new FileWriter("files\\contacts.txt")) {
            writer.write(json);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(json);
    }


    public static void loadFromFile() throws Exception {
        try {
            String json = new String(Files.readAllBytes(Paths.get("files\\contacts.txt")), StandardCharsets.UTF_8);
            List<Contact> newContacts = mapper.readValue(json, List.class);

            System.out.println(newContacts.toString());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}