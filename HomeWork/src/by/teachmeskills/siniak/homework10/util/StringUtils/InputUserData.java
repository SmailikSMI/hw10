package by.teachmeskills.siniak.homework10.util.StringUtils;

import java.util.Scanner;

public class InputUserData {

    public static String getString() {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        string = scanner.nextLine();
        return string;
    }

    public static boolean rulesHideNumBankCard(String string) {
        if (string.length() == 16 || string.length() == 19) {
            return true;
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'А' && c <= 'я')) {
                return false;
            }
        }
        return true;
    }

    public static boolean rulesShortenNames(String SecondName, String FirstName, String MiddleName) {
        String GeneralString = SecondName + FirstName + MiddleName;
        for (int i = 0; i < GeneralString.length(); i++) {
            boolean isDigit = Character.isDigit(GeneralString.charAt(i));
            if (isDigit) {
                return false;
            }
        }
        return true;

    }



}
