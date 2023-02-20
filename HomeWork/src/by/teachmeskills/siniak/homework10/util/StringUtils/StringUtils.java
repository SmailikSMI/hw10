package by.teachmeskills.siniak.homework10.util.StringUtils;

import java.lang.String;


public class StringUtils {
    public static final int CARD_NUMBER_LENGTH = 16;
    public static final int MASCED_CARD_NUMBER_LENGTH = 4;
    public static final int PASPORT_SERIES_LENGTH = 2;
    public static final int PASSPORT_NUMBERS_LENGTH = 7;
    public static final int PASSWORD_LENGTH = 8;

    public static String removeSpace(String string) {
        string = string.trim();
        for (int i = 0; i < string.length(); i++) {
            string = string.replace(" ", "");
        }
        return string;
    }


    public static String hideNumBankCard(String numberCard) {
        return "**** **** **** " + numberCard.substring(CARD_NUMBER_LENGTH - MASCED_CARD_NUMBER_LENGTH);
    }

    public static String shortenNames(String secondName, String firstName, String middleName) {
        String shortFirstName = firstName.charAt(0) + ".";
        String shortMiddleName = middleName;
        if (!middleName.isEmpty()) {
            shortMiddleName = middleName.charAt(0) + ". ";
        }
        return secondName + shortFirstName + shortMiddleName;
    }

    public static boolean isEnglishUpperLetter(char letter) {
        return (letter >= 'A' && letter <= 'Z');
    }

    public static boolean isArabianDigits(char numbers) {
        return '0' <= numbers && numbers <= '9';
    }


    public static boolean checkNumPassport(String passportNumber) {
        if (!(passportNumber.length() == PASPORT_SERIES_LENGTH + PASSPORT_NUMBERS_LENGTH)) {
            return false;
        }
        for (int i = 0; i < PASPORT_SERIES_LENGTH; i++) {
            if (!isEnglishUpperLetter(passportNumber.charAt(i))) {
                return false;
            }
        }
        for (int i = PASPORT_SERIES_LENGTH; i < PASSPORT_NUMBERS_LENGTH; i++) {
            if (!isArabianDigits(passportNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPassword(String password) {
        if (!(password.length() >= PASSWORD_LENGTH)) {
            return false;
        }
        boolean isUpperLetter = false;
        boolean isLowerLetter = false;
        boolean isDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                isUpperLetter = true;
            }

            if (Character.isLowerCase(password.charAt(i))) {
                isLowerLetter = true;
            }

            if (Character.isDigit(password.charAt(i))) {
                isDigit = true;
            }

            if ((isUpperLetter && isLowerLetter && isDigit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmailAddress(String email) {
        int atIndex = email.indexOf('@');
        if (email.contains(" ")) {
            return false;
        }
        if (!(atIndex != -1 && atIndex == email.lastIndexOf("@"))) {
            return false;
        }
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        return true;
    }
}
