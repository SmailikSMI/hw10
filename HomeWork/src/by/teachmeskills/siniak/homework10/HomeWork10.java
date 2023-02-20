package by.teachmeskills.siniak.homework10;

import by.teachmeskills.siniak.homework10.util.StringUtils.InputUserData;
import by.teachmeskills.siniak.homework10.util.StringUtils.StringUtils;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 6) {
            System.out.println("Такого задания не существет");
        }
        switch (taskNumber) {
            case 1 -> {
                string = InputUserData.getString();
                StringUtils.removeSpace(string);
                System.out.println(StringUtils.removeSpace(string));
            }
            case 2 -> {

                string = InputUserData.getString();
                string = StringUtils.removeSpace(string);
                if (!InputUserData.rulesHideNumBankCard(string)) {
                    System.out.println("Введен неверный номер карты");
                    break;
                }
                System.out.println(StringUtils.hideNumBankCard(string));
            }
            case 3 -> {
                Scanner sca = new Scanner(System.in);
                System.out.println("Введите фамилию: ");
                String SecondName = sca.nextLine();
                System.out.println("Введите имя: ");
                String FirstName = sca.nextLine();
                System.out.println("Введите отчество: ");
                String MiddleName = sca.nextLine();
                if (!InputUserData.rulesShortenNames(SecondName, FirstName, MiddleName)) {
                    System.out.println("Введено некорректное значение");
                    break;
                }
                StringUtils.shortenNames(SecondName, FirstName, MiddleName);
                System.out.println(StringUtils.shortenNames(SecondName + " ", FirstName, MiddleName));

            }
            case 4 -> {
                string = InputUserData.getString();
                string = StringUtils.removeSpace(string);
                if (StringUtils.checkNumPassport(string)) {
                    System.out.println("Введен верный номер паспорта");
                } else {
                    System.out.println("Некорректный ввод номера паспорта");
                }
            }
            case 5 -> {
                string = InputUserData.getString();
                if (StringUtils.checkPassword(string)) {
                    System.out.println("Пароль надежный");
                } else {
                    System.out.println("Пароль плохой");
                }
            }
            case 6 -> {
                string = InputUserData.getString();
                if (StringUtils.checkEmailAddress(string)) {
                    System.out.println("Строка является адресом почты");
                } else {
                    System.out.println("Строка не является адресом почты");
                }
            }

        }
    }
}
