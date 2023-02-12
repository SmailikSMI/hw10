package by.teachmeskills.siniak.homework10.util.StringUtils;

import java.lang.String;



public class StringUtils {

    public static String removeSpace(String string) {
        string = string.trim();
        for (int i = 0; i < string.length(); i++) {
            string = string.replace(" ", "");
        }
        return string;
    }


    public static final int CARD_NUMBER_LENGTH = 16;
    public static final int MASCED_CARD_NUMBER_LENGTH = 14;
    public static String hideNumBankCard(String string) {
        if (string.length() == CARD_NUMBER_LENGTH) {
            String hidedenCardNumber = string.substring(CARD_NUMBER_LENGTH-MASCED_CARD_NUMBER_LENGTH);
            string = string.replace(hidedenCardNumber, "************");
        }
        return string;
    }

    public static String shortenNames(String SecondName, String FirstName, String MiddleName) {
        FirstName = FirstName.charAt(0) + ".";
        if (!MiddleName.isEmpty()) {
            MiddleName = MiddleName.charAt(0) + ". ";
        }
        return SecondName + FirstName + MiddleName;
    }

    public static String removeSpacePassport(String string) {
        string = string.trim();
        for (int i = 0; i < string.length(); i++) {
            string = string.replace(" ", "");
        }
        return string;
    }

    public static boolean isUpperWords(String string){
        boolean isUpperWord1 = Character.isUpperCase(string.charAt(0));
        boolean isUpperWord2 = Character.isUpperCase(string.charAt(1));
        return isUpperWord1 && isUpperWord2;
    }

    public static boolean isEnglishWords(String string){
        boolean isEnglishWord1 = (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z');
        boolean isEnglishWord2 = (string.charAt(1) >= 'A' && string.charAt(1) <= 'Z');
        return isEnglishWord1 && isEnglishWord2;
    }

    public static final int PASPORT_SERIES_LENGTH=2;

    public static boolean isArabianDigits(String string){
        for (int i = PASPORT_SERIES_LENGTH; i < string.length(); i++) {
            if (!('0'>=string.charAt(i) && string.length()<='9')) {
                return false;
            }
        }
        return true;
    }
    public static final int PASSPORT_NUMBERS_LENGTH=7;

    public static boolean checkNumPassport(String string) {
        if (!StringUtils.isUpperWords(string)) {
            return false;
        }

        if (!isEnglishWords(string)) {
            return false;
        }

        for (int i = PASPORT_SERIES_LENGTH; i < string.length(); i++) {
            if (!(StringUtils.isArabianDigits(string) &&
                    string.length() == PASPORT_SERIES_LENGTH + PASSPORT_NUMBERS_LENGTH)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPassword(String string) {
        int LengthMore8 = 0;
        if (string.length() >= 7) {
            LengthMore8++;
        }
        int wasUpperLetter = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((Character.isUpperCase(string.charAt(i)))) {
                wasUpperLetter++;
                break;
            }
        }
        int wasLowerLetter = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((Character.isLowerCase(string.charAt(i)))) {
                wasLowerLetter++;
                break;
            }
        }
        int wasDigit = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((Character.isDigit(string.charAt(i)))) {
                wasDigit++;
                break;
            }
        }
        if ((wasUpperLetter + wasLowerLetter + wasDigit + LengthMore8 == 4)) {

            return true;
        }
        return false;
    }

    public static boolean checkEmailAddress(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                return false;
            }
            if (!(string.contains("@") && string.indexOf('@') == string.charAt(i))) {
                return false;
            }
            if (string.indexOf('@') == 0 || string.indexOf('@') == string.length() - 1) {
                return false;
            }
        }
        return true;
    }

}
